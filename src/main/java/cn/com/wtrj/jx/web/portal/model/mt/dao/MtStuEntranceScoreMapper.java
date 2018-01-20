package cn.com.wtrj.jx.web.portal.model.mt.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjStuEntranceScore;

public interface MtStuEntranceScoreMapper {
	/**
	 * 按学生ID查找成绩
	 * 
	 * @param studentId
	 *            学生ID
	 * @return 学生的成绩集合
	 */
	List<WtrjStuEntranceScore> searchByStudent(@Param(value = "id") int studentId);
}