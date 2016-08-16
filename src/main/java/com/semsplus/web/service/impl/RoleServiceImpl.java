package com.semsplus.web.service.impl;

import java.util.List;
import javax.annotation.Resource;

import com.semsplus.core.generic.GenericServiceImpl;
import com.semsplus.web.model.Role;
import org.springframework.stereotype.Service;
import com.semsplus.core.generic.GenericDao;
import com.semsplus.web.dao.RoleMapper;
import com.semsplus.web.service.RoleService;

/**
 * 角色Service实现类
 *
 * @author StarZou
 * @since 2014年6月10日 下午4:16:33
 */
@Service
public class RoleServiceImpl extends GenericServiceImpl<Role, Long> implements RoleService {

    @Resource
    private RoleMapper roleMapper;

    @Override
    public GenericDao<Role, Long> getDao() {
        return roleMapper;
    }

    @Override
    public List<Role> selectRolesByUserId(Long userId) {
        return roleMapper.selectRolesByUserId(userId);
    }

}
