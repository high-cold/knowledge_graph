package com.knowledge_graph.knowledge_graph;

import com.knowledge_graph.entity.Julei;
import com.knowledge_graph.entity.LevelClass;
import com.knowledge_graph.service.JuleiService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class KnowledgeGraphApplicationTests {

    @Autowired
    private JuleiService juleiService;
    @Test
    void contextLoads() {
        List<Julei> list = juleiService.list();
        System.out.println(list);
    }

    @Test
    void test(){
        Julei julei = juleiService.query().eq("name", "刘严").one();
        System.out.println(julei);
    }

    @Test
    void test2(){
        LevelClass levelClass = new LevelClass();
        levelClass.A=new ArrayList<>();
        levelClass.A.add("111");
        System.out.println(levelClass);
    }

}
