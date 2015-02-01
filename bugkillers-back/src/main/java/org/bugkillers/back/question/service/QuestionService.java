package org.bugkillers.back.question.service;

import java.util.List;

import org.bugkillers.back.bean.Question;
import org.bugkillers.back.question.dao.QuestionMapper;
import org.bugkillers.back.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 用户后台服务
 * <p/>
 * <p> @author 刘新宇
 *
 * <p> @date 2015年1月27日 下午2:11:10
 * <p> @version 0.0.1
 */
@Service("questionService")
public class QuestionService implements IService<Question>{
	@Autowired //注入
	private QuestionMapper questionMapper;

	@Override
	public boolean save(Question t) {
		
		return questionMapper.save(t)==0?false:true;
	}

	@Override
	public boolean update(Question t) {
		return questionMapper.update(t)==0?false:true;
	}

	@Override
	public boolean delete(int pk) {
		return questionMapper.delete(pk)==0?false:true;
	}

	@Override
	public Question findByPk(int pk) {
		return questionMapper.findByPk(pk);
	}

	@Override
	public List<Question> findAll() {
		return questionMapper.findAll();
	}
	
	
}
