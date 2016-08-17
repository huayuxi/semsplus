package com.semsplus.web.dao;

import com.semsplus.core.generic.GenericDao;
import com.semsplus.web.model.Auth;

public interface AuthMapper extends GenericDao<Auth,Integer>{
    int deleteByPrimaryKey(Integer auth_id);

    int insert(Auth record);

    int insertSelective(Auth record);

    Auth selectByPrimaryKey(Integer auth_id);

    int updateByPrimaryKeySelective(Auth record);

    int updateByPrimaryKey(Auth record);
}