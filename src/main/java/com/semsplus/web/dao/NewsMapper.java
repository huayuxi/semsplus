package com.semsplus.web.dao;

import com.semsplus.core.generic.GenericDao;
import com.semsplus.web.model.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsMapper extends GenericDao<News,Integer>{
    int deleteByPrimaryKey(Integer news_id);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer news_id);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKeyWithBLOBs(News record);

    int updateByPrimaryKey(News record);

    List<News> selectByPage(@Param("start") Integer start,@Param("end") Integer end);
}