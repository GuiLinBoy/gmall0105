package com.guiglin.gmall.user.controller;


import com.guiglin.gmall.user.bean.UmsMemberEntity;
import com.guiglin.gmall.user.mapper.UserMemberMapper;
import com.guiglin.gmall.user.tools.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    UserMemberMapper userMemberMapper;

    @RequestMapping("/hello")
    @ResponseBody
    public UmsMemberEntity hello(String id){

        List<UmsMemberEntity> userById = userMemberMapper.getUserById(id);


        return userById.get(0);
    }

    //删除某一条数据
    @RequestMapping("/del")
    @ResponseBody
    public String delUser(String id){

        int i = userMemberMapper.deleteUserById(id);

        return i==1?"success":"fail";
    }

    //添加一条数据
    @RequestMapping("/add")
    @ResponseBody
    public UmsMemberEntity addUser(UmsMemberEntity u){

        try {
            int i = userMemberMapper.addUser(u);
        }catch (DuplicateKeyException e){
            /*e.printStackTrace();
            if (e instanceof org.springframework.dao.DuplicateKeyException){
                System.out.println("用户命存在！");
            }else{
                System.out.println("haha");
            }*/
            System.out.println(u.getUsername()+"存在");
        }

        return u;
    }


    //更改某一个用户的数据
    @RequestMapping("/update")
    @ResponseBody
    public Result update(UmsMemberEntity umsMemberEntity){

        int i = userMemberMapper.updateUser(umsMemberEntity);



        return i ==1 ?new Result(200,"chenggong",umsMemberEntity):new Result(400,"shibai",umsMemberEntity);
    }


}
