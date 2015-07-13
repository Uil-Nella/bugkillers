package org.bugkillers.core.service.impl;

import org.apache.commons.collections.CollectionUtils;
import org.bugkillers.core.dao.QuestionDOMapper;
import org.bugkillers.core.dao.QuestionTagDOMapper;
import org.bugkillers.core.dao.UserDOMapper;
import org.bugkillers.core.domain.QuestionDO;
import org.bugkillers.core.domain.QuestionTagDO;
import org.bugkillers.core.domain.QuestionTagDOExample;
import org.bugkillers.core.domain.UserDO;
import org.bugkillers.core.model.Question;
import org.bugkillers.core.model.Tag;
import org.bugkillers.core.model.User;
import org.bugkillers.core.result.BaseResult;
import org.bugkillers.core.service.IQuestionService;
import org.bugkillers.core.util.BeanMapper;
import org.bugkillers.core.util.FillAttributeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuxinyu on 15/6/22.
 */
@Service
public class QuestionServiceImpl implements IQuestionService {

    @Autowired
    private BeanMapper beanMapper;
    @Autowired
    private QuestionDOMapper questionDOMapper;
    @Autowired
    private QuestionTagDOMapper questionTagDOMapper;
    @Autowired
    private UserDOMapper userDOMapper;

    /**
     * 根据id查询问题
     *
     * @param id
     * @return
     */
    @Override
    public Question findById(Integer id) {
        QuestionDO questionDO = questionDOMapper.selectByPrimaryKey(id);
        if (questionDO == null) {
            return null;
        }

        Question question = new Question();
        beanMapper.copy(questionDO, question);
        //***************组装question上的标签
        QuestionTagDOExample example = new QuestionTagDOExample();
        example.or().andQuestionIdEqualTo(id);
        List<QuestionTagDO> questionTagDOs = questionTagDOMapper.selectByExample(example);
        List<Tag> tags = new ArrayList<>();
        //TODO 使用dozer转换
//        beanMapper.mapList(questionTagDOs, Tag);
        if (CollectionUtils.isNotEmpty(questionTagDOs)) {
            for (QuestionTagDO questionTagDO : questionTagDOs) {
                Tag tag = new Tag();
                tag.setId(questionTagDO.getTagId());
                tag.setTagName(questionTagDO.getTagName());
                tags.add(tag);
            }
            question.setTags(tags);
        }
        //*************组装question上的用户
        UserDO userDO = userDOMapper.selectByPrimaryKey(questionDO.getUserId());
        if (null != userDO) {
            User user = new User();
            beanMapper.copy(userDO, user);
            question.setUser(user);
        }

        return question;
    }

    /**
     * 通过标签查找一组问题
     *
     * @param tagId
     * @return
     */
    @Override
    public List<Question> findByTagId(Integer tagId) {
        return null;
    }

    /**
     * 查询最新创建的 offset 个问题
     *
     * @param offset
     * @return
     */
    @Override
    public List<Question> filterByCreate(Integer offset) {
        return null;
    }


    /**
     * 创建或修改问题
     *
     * @param question
     * @return
     */
    @Override
    public BaseResult<Question> createOrModifiedQuestion(Question question) {
        //校验
        BaseResult<Question> result = new BaseResult<>();
        boolean flag = true;
        QuestionDO questionDO = new QuestionDO();
        beanMapper.copy(question, questionDO);
        questionDO.setQuestionStatus(1);
        FillAttributeUtil.fillNecessaryAttribute(questionDO, QuestionDO.class);
        questionDO.setUserId(question.getUser().getId());
        flag&=questionDOMapper.insert(questionDO)>0;


        List<Tag> tags = question.getTags();
        for (Tag tag:tags){
            QuestionTagDO questionTagDO = new QuestionTagDO();
            questionTagDO.setTagId(tag.getId());
            questionTagDO.setTagName(tag.getTagName());
            questionTagDO.setQuestionId(questionDO.getId());
            FillAttributeUtil.fillNecessaryAttribute(questionTagDO, QuestionTagDO.class);
            flag&=questionTagDOMapper.insert(questionTagDO)>0;
        }

        if (!flag){
            return result.setRet(false).setMsg("数据库操作出错");
        }
        return result.setRet(true);
    }
}
