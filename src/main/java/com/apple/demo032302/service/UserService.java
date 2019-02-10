package com.apple.demo032302.service;

import com.apple.demo032302.entity.User;
import java.util.List;



/**

 * @Author:autumn_leaf

 * @Date:2019/03/17

 * 服务接口类

 */

public interface UserService {



    List<User> findAll();



    User findById(int id);



}

