package com.semsplus.test.dao;

import java.util.List;
import javax.annotation.Resource;

import com.semsplus.core.feature.orm.mybatis.Page;
import com.semsplus.core.feature.test.TestSupport;
import com.semsplus.web.dao.UserMapper;
import com.semsplus.web.model.User;
import com.semsplus.web.model.UserExample;
import org.junit.Test;

public class UserMapperTest extends TestSupport {
    @Resource
    private UserMapper userMapper;

    @Test
    public void test_selectByExampleAndPage() {
        start();
        Page<User> page = new Page<>(1, 3);
        UserExample example = new UserExample();
        example.createCriteria().andIdGreaterThan(0L);
        final List<User> users = userMapper.selectByExampleAndPage(page, example);
        for (User user : users) {
            System.err.println(user);
        }
        end();
    }
}
