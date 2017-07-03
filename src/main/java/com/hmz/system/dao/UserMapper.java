package com.hmz.system.dao;

import com.hmz.system.model.User;
/*
 * @Author: Hu mingzhi
 * @Date: 2017/6/18
 * 
 */
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    boolean selectUser(String username);
}