package com.guilin.gmall.service;

import com.guilin.gmall.bean.UmsMember;

import java.util.List;

public interface UserService {

    public List<UmsMember> getUserById(String id);

    public int deleteUserById(String id);

    public int addUser(UmsMember u);

    public int updateUser(UmsMember umsMember);

}
