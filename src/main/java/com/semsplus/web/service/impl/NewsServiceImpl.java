package com.semsplus.web.service.impl;

import com.semsplus.core.generic.GenericDao;
import com.semsplus.core.generic.GenericServiceImpl;
import com.semsplus.web.dao.NewsMapper;
import com.semsplus.web.model.News;
import com.semsplus.web.service.NewsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/8/17.
 */
@Service
public class NewsServiceImpl extends GenericServiceImpl<News,Integer> implements NewsService{

    @Resource
    private NewsMapper newsMapper;

    @Override
    public GenericDao<News, Integer> getDao() {
        return newsMapper;
    }

    @Override
    public List<News> selectByPage(String pageNo,String pageSize) {
        Integer start=(Integer.valueOf(pageNo)-1)*Integer.valueOf(pageSize);
        Integer end=Integer.valueOf(pageSize);
        return newsMapper.selectByPage(start,end);
    }

    @Override
    public int insert(News news) {
        return newsMapper.insert(news);
    }

    @Override
    public int update(News news) {
        return newsMapper.updateByPrimaryKey(news);
    }

    @Override
    public int delete(Integer id) {
        return newsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public News selectById(Integer id) {
        return newsMapper.selectByPrimaryKey(id);
    }

    @Override
    public News selectOne() {
        return null;
    }

    @Override
    public List<News> selectList() {
        return null;
    }
}
