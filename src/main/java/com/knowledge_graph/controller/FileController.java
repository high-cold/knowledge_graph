package com.knowledge_graph.controller;

import com.knowledge_graph.controller.utils.R;
import org.apache.commons.io.FileUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;

/**
 * @program: springboot_ssmp
 * @description:
 * @author: Lin
 * @create: 2023-05-08 23:37
 **/
@Controller
@RequestMapping("input")
public class FileController {
    private static String UPLOAD_PATH;


    @PostMapping
    public R upload(@RequestParam MultipartFile multipartFile) throws Exception {



        return null;




//        File fileDir = new File(upload);
//        File[] files = fileDir.listFiles();
//        for (File f : files) {
//            f.delete();
//        }

//        String path = upload + filename;
//        File filePath = new File(path);
//        FileController.UPLOAD_PATH = path;
//        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(filePath));
//        outputStream.write(file.getBytes());
//        outputStream.flush();
//        outputStream.close();
    }

}
