package org.bugkillers.back.tag.dao;

import java.util.List;

import org.bugkillers.back.bean.Tag;
import org.bugkillers.back.dao.Mapper;
/**
 * 标签mapper
 * <p/>
 * <p> @author 刘新宇
 *
 * <p> @date 2015年1月30日 下午2:46:20
 * <p> @version 0.0.1
 */
public interface TagMapper extends Mapper<Tag>{
	public int save(Tag tag);
	public int update(Tag tag);
	public int delete(int pk_tag);
	public Tag findByPk(int pk_tag);
	public List<Tag> findAll();
}
