package com.knowledge_graph.controller.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @program: demo
 * @description:作为springMVC的异常处理器
 * @author: Lin
 * @create: 2023-04-16 23:03
 **/
@RestControllerAdvice
public class ProjectExceptionAdvice {
    //拦截所有的异常信息
    @ExceptionHandler(Exception.class)
    private R doException(Exception e){

        e.printStackTrace();
        return new R("服务器故障，请联系管理员");
    }
}
