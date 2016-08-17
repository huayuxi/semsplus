package com.semsplus.web.controller;

import com.semsplus.core.entity.JSONResult;
import com.semsplus.web.service.NewsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/8/17.
 */
@Controller
@RequestMapping("/news")
public class NewsController {

    @Resource
    private NewsService newsService;

    @ResponseBody
    @RequestMapping(value = "/{pageNo}/{pageSize}",method = RequestMethod.GET)
    public JSONResult queryByPage(@PathVariable String pageNo,@PathVariable String pageSize){
        return new JSONResult<>(newsService.selectByPage(pageNo,pageSize));
    }

    @ResponseBody
    @RequestMapping(value = "/system",method = RequestMethod.POST)
    public JSONResult addNews(@PathVariable String pageNo,@PathVariable String pageSize){
        return new JSONResult<>(newsService.selectByPage(pageNo,pageSize));
    }


    @ResponseBody
    @RequestMapping(value = "/system",method = RequestMethod.PUT)
    public JSONResult updateNews(@PathVariable String pageNo,@PathVariable String pageSize){
        return new JSONResult<>(newsService.selectByPage(pageNo,pageSize));
    }



}
