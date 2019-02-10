package com.apple.demo032302.mapper;


import com.apple.demo032302.entity.User;

import org.apache.ibatis.annotations.Mapper;



import java.util.List;



/**

 * @Author:autumn_leaf

 * @Date:2019/03/17

 */

@Mapper

//此处用@Repository也行

public interface UserMapper {



    User findById(int id);



    List<User> findAll();

}
