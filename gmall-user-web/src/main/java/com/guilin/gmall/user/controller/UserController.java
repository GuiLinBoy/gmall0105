package com.guilin.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.guilin.gmall.bean.UmsMember;
import com.guilin.gmall.service.UserService;
import com.guilin.gmall.user.tools.Result;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class UserController {

    @Reference
    UserService userService;


    @RequestMapping("/hello")
    @ResponseBody
    public UmsMember hello(String id){

        List<UmsMember> userById = userService.getUserById(id);


        return userById.get(0);
    }

    //删除某一条数据
    @RequestMapping("/del")
    @ResponseBody
    public String delUser(String id){

        int i = userService.deleteUserById(id);

        return i==1?"success":"fail";
    }

    //添加一条数据
    @RequestMapping("/add")
    @ResponseBody
    public UmsMember addUser(UmsMember u){

        try {
            int i = userService.addUser(u);
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
    public Result update(UmsMember umsMember){

        int i = userService.updateUser(umsMember);



        return i ==1 ?new Result(200,"chenggong", umsMember):new Result(400,"shibai", umsMember);
    }


}
