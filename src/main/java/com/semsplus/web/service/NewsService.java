package com.semsplus.web.service;

import com.semsplus.core.generic.GenericService;
import com.semsplus.web.model.News;

import java.util.List;

/**
 * Created by Administrator on 2016/8/17.
 */
public interface NewsService extends GenericService <News,Integer>{

    List<News> selectByPage(String pageNo,String pageSize);

}
