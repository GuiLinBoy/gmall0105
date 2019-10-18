package com.guiglin.gmall.user.mapper;



//mybatis注解版

import com.guiglin.gmall.user.bean.UmsMemberEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

//@mapper  这个因为在启动类上加上了扫描mapper包的注解就可以不用加了
public interface UserMemberMapper {

    //根据id查询用户信息
    @Select("select *  from ums_member where id=#{id}")
    public List<UmsMemberEntity> getUserById(String id);

    //根据id删除用户数据
    @Delete("delete from ums_member where id=#{id}")
    public int deleteUserById(String id);

    //添加一条用户数据
    @Options(useGeneratedKeys = true,keyProperty = "id")//使用自动生成的主键id，id作为主键这样在添加后会把相应的id返回
    @Insert("insert into ums_member (username) values (#{username})")
    public int addUser(UmsMemberEntity u);

    //更新一条用户数据
    @Update("update ums_member set username = #{username} where id=#{id}")
    public int updateUser(UmsMemberEntity umsMemberEntity);
}
