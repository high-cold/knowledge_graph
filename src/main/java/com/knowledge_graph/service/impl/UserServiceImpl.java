package com.knowledge_graph.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.knowledge_graph.mapper.UserMapper;
import com.knowledge_graph.entity.User;
import com.knowledge_graph.service.IUserService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: demo
 * @description:
 * @author: Lin
 * @create: 2023-04-16 20:11
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public boolean savaUser(User user) {
        return userMapper.insert(user)>0;
    }
    @Override
    public boolean modify(User user) {
        return userMapper.updateById(user) > 0;
    }
    @Override
    public boolean delete(Integer id) {
        return userMapper.deleteById(id) > 0;
    }

    @Override
    public IPage<User> getPage(int currentPage, int pageSize) {
        IPage<User> page=new Page<>(currentPage,pageSize);
        userMapper.selectPage(page,null);
        return page;
    }

    @Override
    public IPage<User> getPage(int currentPage, int pageSize, User user) {
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();
        lqw.like(Strings.isNotEmpty(user.getName()),User::getName,user.getName());
        lqw.like(Strings.isNotEmpty(user.getStudentid()),User::getStudentid,user.getStudentid());
        lqw.like(Strings.isNotEmpty(user.getPassword()),User::getPassword,user.getPassword());
        lqw.like(Strings.isNotEmpty(user.getMajor()),User::getMajor,user.getMajor());
        lqw.like(Strings.isNotEmpty(user.getGender()),User::getGender,user.getGender());
        lqw.like(Strings.isNotEmpty(user.getGrade()),User::getGrade,user.getGrade());
        lqw.like(Strings.isNotEmpty(user.getType()),User::getType,user.getType());
        IPage<User> page=new Page<>(currentPage,pageSize);
        userMapper.selectPage(page,lqw);
        return page;
    }


}
