package org.bugkillers.back.tag.service;

import java.util.List;

import org.bugkillers.back.bean.Tag;
import org.bugkillers.back.service.IService;
import org.bugkillers.back.tag.dao.TagMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 标签后台服务
 * <p/>
 * <p> @author 刘新宇
 *
 * <p> @date 2015年1月27日 下午2:11:10
 * <p> @version 0.0.1
 */
@Service("tagService")
public class TagService implements IService<Tag>{
	@Autowired
	private TagMapper tagMapper;

	@Override
	public boolean save(Tag t) {
		
		return tagMapper.save(t)==0?false:true;
	}

	@Override
	public boolean update(Tag t) {
		return tagMapper.update(t)==0?false:true;
	}

	@Override
	public boolean delete(int pk) {
		return tagMapper.delete(pk)==0?false:true;
	}

	@Override
	public Tag findByPk(int pk) {
		return tagMapper.findByPk(pk);
	}

	@Override
	public List<Tag> findAll() {
		return tagMapper.findAll();
	}
	
	
 }
