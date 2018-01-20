package cn.com.wtrj.jx.web.portal.model.dao;

import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreUpload;
import cn.com.wtrj.jx.web.portal.model.entities.WtrjRptScoreUploadExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WtrjRptScoreUploadMapper {
    int countByExample(WtrjRptScoreUploadExample example);

    int deleteByExample(WtrjRptScoreUploadExample example);

    int deleteByPrimaryKey(String id);

    int insert(WtrjRptScoreUpload record);

    int insertSelective(WtrjRptScoreUpload record);

    List<WtrjRptScoreUpload> selectByExample(WtrjRptScoreUploadExample example);

    WtrjRptScoreUpload selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") WtrjRptScoreUpload record, @Param("example") WtrjRptScoreUploadExample example);

    int updateByExample(@Param("record") WtrjRptScoreUpload record, @Param("example") WtrjRptScoreUploadExample example);

    int updateByPrimaryKeySelective(WtrjRptScoreUpload record);

    int updateByPrimaryKey(WtrjRptScoreUpload record);
}