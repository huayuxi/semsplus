package com.semsplus.web.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 公共视图控制器
 * 
 * @author starzou
 * @since 2014年4月15日 下午4:16:34
 **/
@Controller
public class CommonController {
    /**
     * 首页
     * 
     * @param request
     * @return
     */
    @RequestMapping(value = "index/{id}",method = RequestMethod.GET)
    public ModelAndView index(HttpServletRequest request,@PathVariable String id) {
        return  new ModelAndView("index","id",id);
    }

}