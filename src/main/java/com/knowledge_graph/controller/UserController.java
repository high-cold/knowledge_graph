package com.knowledge_graph.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.knowledge_graph.controller.utils.R;
import com.knowledge_graph.entity.User;
import com.knowledge_graph.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: demo
 * @description:表现层
 * @author: Lin
 * @create: 2023-04-16 20:23
 **/

@RestController
//REST标准开发风格
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping
    public R getAll() {
        return new R(true,userService.list());
    }

    @PostMapping
    public R save(@RequestBody User user) {
        boolean flag=userService.save(user);
        return new R(flag,flag?"添加成功!":"添加失败!");
    }

    @PutMapping
    public R update(@RequestBody User user) {
        return new R(userService.modify(user));
    }

    @DeleteMapping({"{id}"})
    public R delete(@PathVariable Integer id) {
        return new R(userService.delete(id));
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id) {
        return new R(true, userService.getById(id));
    }

    @GetMapping("/{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage, @PathVariable int pageSize,User user) {

        IPage<User> page=userService.getPage(currentPage,pageSize,user);
        if (currentPage>page.getPages()){
            page=userService.getPage((int) page.getPages(),pageSize);
        }
        return new R(page);
    }
}
