package com.knowledge_graph.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Knowledge_graph
 * @description:
 * @author: Lin
 * @create: 2023-10-08 18:35
 **/
@Data
public class LevelClass {
    public String name;
    public List<String> A;
    public List<String> B;
    public List<String> C;


    public LevelClass() {
        A = new ArrayList<>();
        B = new ArrayList<>();
        C = new ArrayList<>();
    }
}
