package com.knowledge_graph.controller.utils;

import lombok.Data;

/**
 * @program: demo
 * @description:R为统一的数据传输格式，便于前端开发时读取数据
 * @author: Lin
 * @create: 2023-04-16 21:20
 **/

@Data
public class R {
    private Boolean flag;
    private Object data;
    private String msg;

    public R() {
    }

    public R(Boolean flag) {
        this.flag = flag;
    }

    public R(String msg) {
        this.msg = msg;
    }

    public R(Object data){
        this.data=data;
    }

    public R(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }

    public R(Boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }


}
