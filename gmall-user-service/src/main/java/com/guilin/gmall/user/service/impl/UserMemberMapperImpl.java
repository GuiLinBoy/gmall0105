package com.guilin.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.guilin.gmall.bean.UmsMember;
import com.guilin.gmall.service.UserService;
import com.guilin.gmall.user.mapper.UserMemberMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserMemberMapperImpl implements UserService {
    @Autowired
    UserMemberMapper userMemberMapper;

    @Override
    public List<UmsMember> getUserById(String id) {
        List<UmsMember> userById = userMemberMapper.getUserById(id);
        return userById;
    }

    @Override
    public int deleteUserById(String id) {
        int i = userMemberMapper.deleteUserById(id);
        return i;
    }

    @Override
    public int addUser(UmsMember u) {
        int i = userMemberMapper.addUser(u);
        return i;
    }

    @Override
    public int updateUser(UmsMember umsMember) {
        int i = userMemberMapper.updateUser(umsMember);
        return i;
    }
}
