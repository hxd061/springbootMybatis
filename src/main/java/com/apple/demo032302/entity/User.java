package com.apple.demo032302.entity;

/**
 * @Author:autumn_leaf
 * @Date:2019/03/17 用户实体类
 */

public class User {


    private Integer id;


    private String loginName;


    private String username;


    private char sex;


    private int age;


    public User() {

        super();

    }


    public Integer getId() {

        return id;

    }


    public void setId(Integer id) {

        this.id = id;

    }


    public String getLoginName() {

        return loginName;

    }


    public void setLoginName(String loginName) {

        this.loginName = loginName;

    }


    public String getUsername() {

        return username;

    }


    public void setUsername(String username) {

        this.username = username;

    }


    public char getSex() {

        return sex;

    }


    public void setSex(char sex) {

        this.sex = sex;

    }


    public int getAge() {

        return age;

    }


    public void setAge(int age) {

        this.age = age;

    }


    @Override

    public String toString() {

        return "User{" +

                "id=" + id +

                ", loginName='" + loginName + '\'' +

                ", username='" + username + '\'' +

                ", sex=" + sex +

                ", age=" + age +

                '}';

    }

}
