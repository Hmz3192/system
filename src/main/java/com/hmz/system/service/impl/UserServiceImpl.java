package com.hmz.system.service.impl;

import com.hmz.system.dao.UserMapper;
import com.hmz.system.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Author Hu mingzhi
 * Created by ThinKPad on 2017/6/18.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;
    public boolean selectUser(String username) {
        return userMapper.selectUser(username);
    }
}
