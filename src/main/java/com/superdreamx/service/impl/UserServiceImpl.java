package com.superdreamx.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.superdreamx.IDao.UserMapper;
import com.superdreamx.model.User;
import com.superdreamx.service.UserService;

@Service("userService")  
public class UserServiceImpl implements UserService {  
    @Resource  
    private UserMapper userDao;  
    @Override  
    public User getUserById(int userId) {  
        // TODO Auto-generated method stub  
        return this.userDao.selectByPrimaryKey(userId);  
    }  
  
}  
