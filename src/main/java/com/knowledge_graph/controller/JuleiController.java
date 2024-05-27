package com.knowledge_graph.controller;

import com.knowledge_graph.controller.utils.R;
import com.knowledge_graph.entity.Julei;
import com.knowledge_graph.service.JuleiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @program: Knowledge_graph
 * @description:
 * @author: Lin
 * @create: 2023-10-08 17:56
 **/
@Controller
@RequestMapping("/julei")
public class JuleiController {

    @Autowired
    private JuleiService juleiService;

    @GetMapping
    public R getAll(){
        List<Julei> list = juleiService.list();
        System.out.println(list);
        return null;
    }

    @GetMapping("/name")
    public R getByNameOrderByLevel(String name){
        return new R(true,juleiService.query().eq("name", name).one());
    }

    @GetMapping("/onLoad")
    public R onLoad() throws Exception{
        String pythonScript = "D:\\julei\\test.py";//存放.py文件的位置
        String pythonScript1 = "D:\\Biancheng\\Python3.11.3\\python.exe";//存放py环境的位置
        ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/k", "start", pythonScript1, pythonScript);
        Process start = processBuilder.start();
        processBuilder.command("python", "test.py");
        return new R(true);
    }
}
