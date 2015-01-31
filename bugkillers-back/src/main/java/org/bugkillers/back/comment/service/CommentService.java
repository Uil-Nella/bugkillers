package org.bugkillers.back.comment.service;

import java.util.List;

import org.bugkillers.back.bean.Comment;
import org.bugkillers.back.comment.dao.CommentMapper;
import org.bugkillers.back.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 评论后台服务
 * <p/>
 * <p> @author 刘新宇
 *
 * <p> @date 2015年1月27日 下午2:11:10
 * <p> @version 0.0.1
 */
@Service("commentService")
public class CommentService implements IService<Comment>{
	@Autowired //注入
	private CommentMapper commentMapper;

	@Override
	public boolean save(Comment t) {
		
		return commentMapper.save(t)==0?false:true;
	}

	@Override
	public boolean update(Comment t) {
		return commentMapper.update(t)==0?false:true;
	}

	@Override
	public boolean delete(int pk) {
		return commentMapper.delete(pk)==0?false:true;
	}

	@Override
	public Comment findByPk(int pk) {
		return commentMapper.findByPk(pk);
	}

	@Override
	public List<Comment> findAll() {
		return commentMapper.findAll();
	}
	
	
}
