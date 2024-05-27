package com.knowledge_graph.controller.utils;

import java.io.IOException;

/**
 * @program: Knowledge_graph
 * @description:
 * @author: Lin
 * @create: 2023-09-28 16:38
 **/
public class cmdd {
    public static void main(String[] args)throws IOException, InterruptedException {
        //Process p;
        //p = Runtime.getRuntime().exec("cmd /c start D:\\SOFTWARE\\python\\python.exe D:\\julei\\test.py");
        //第一种启动方式、需要python环境的路劲和程序代码位置，不能配置相对路径在程序以及调用路径中


        String pythonScript = "D:\\julei\\test.py";//存放.py文件的位置
        String pythonScript1 = "D:\\Biancheng\\Python3.11.3\\python.exe";//存放py环境的位置
        ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/k", "start", pythonScript1, pythonScript);
        Process start = processBuilder.start();
        processBuilder.command("python", "test.py");
        //2.调用字符串变量存放路径调用进程类运行

//        BufferedReader reader = new BufferedReader(new InputStreamReader(start.getInputStream()));
//        String line;
//        while ((line = reader.readLine()) != null) {
//            System.out.println(line);
//        }
    }
}
