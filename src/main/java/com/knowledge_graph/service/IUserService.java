package com.knowledge_graph.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.knowledge_graph.entity.User;

public interface IUserService extends IService<User> {

    boolean savaUser(User user);

    boolean modify(User user);

    boolean delete(Integer id);

    IPage<User> getPage(int currentPage,int pageSize);

    IPage<User> getPage(int currentPage, int pageSize, User user);
}
