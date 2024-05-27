package com.knowledge_graph.entity;

import lombok.Data;

/**
 * @program: demo
 * @description:
 * @author: Lin
 * @create: 2023-04-16 18:48
 **/
@Data
public class User {
    private Integer id;
    private String studentid;
    private String name;
    private String password;
    private String major;
    private String gender;
    private String grade;
    private String type;
}
