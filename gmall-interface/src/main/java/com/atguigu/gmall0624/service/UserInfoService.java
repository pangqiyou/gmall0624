package com.atguigu.gmall0624.service;

import com.atguigu.gmall0624.bean.UserAddress;
import com.atguigu.gmall0624.bean.UserInfo;

import java.util.List;

public interface UserInfoService {

    //查询所有数据

    /**
     * 返回list集合
     * @return
     */
    List<UserInfo> findAll();

    //根据用户id或者用户的昵称或者用户的名称等多个不同个字段进行查询，如果不输入，则查询所有
    List<UserInfo> findUserInfo(UserInfo userInfo);

    //模糊查询
    List<UserInfo> findByNickName(String nickName);

    //添加方法
    void addUser(UserInfo userInfo);

    //修改的fangfa
    void  updateUser(UserInfo userInfo);

    //删除的fangfa
    void  delUser(UserInfo userInfo);
    //查找用户收获地址
    List<UserAddress> findUserAddressByUserId(String userId);

    //查找用户收获地址
    List<UserAddress> findUserAddressByUserId(UserAddress userAddress);
}
