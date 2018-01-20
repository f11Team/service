package cn.com.wtrj.jx.web.portal.service.tag;

import java.util.List;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjEcomTag;

public interface TagService {
	
	

	
	
	void deleteTag(int id);

	/**
	 * 根据指定条件分页获取标签信息
	 * 
	 * @param start
	 * @param limit
	 * @param search
	 * @return
	 */
	List<WtrjEcomTag> searchTagByPage(Integer start, Integer end, String search);

	/**
	 * 根据指定条件检索用户数量
	 * @param search
	 * @return
	 */
	int countTag(String search);
	
	Boolean addTag(String tagName);

	Boolean updateTag(WtrjEcomTag wtrjEcomTag);

}
