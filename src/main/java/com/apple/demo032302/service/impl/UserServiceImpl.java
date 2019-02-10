package com.apple.demo032302.service.impl;

import com.apple.demo032302.entity.User;
import com.apple.demo032302.mapper.UserMapper;
import com.apple.demo032302.service.UserService;
import org.springframework.stereotype.Service;



import javax.annotation.Resource;

import java.util.List;



/**

 * @Author:autumn_leaf

 * @Date:2019/03/17

 * 接口实现类

 */

@Service

public class UserServiceImpl implements UserService {



    //@Autowired根据类型注入,@Resource根据名称注入,此处@Autowired也行

    @Resource

    private UserMapper userMapper;



    @Override

    public List<User> findAll() {

        return userMapper.findAll();

    }



    @Override

    public User findById(int id) {

        return userMapper.findById(id);

    }

}
