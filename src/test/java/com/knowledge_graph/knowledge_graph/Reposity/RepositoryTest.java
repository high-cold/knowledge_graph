package com.knowledge_graph.knowledge_graph.Reposity;


import com.knowledge_graph.Repository.*;
import com.knowledge_graph.controller.utils.R;
import com.knowledge_graph.entity.*;
import com.sun.javafx.scene.paint.GradientUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @program: demo
 * @description:
 * @author: Lin
 * @create: 2023-04-19 21:51
 **/
@SpringBootTest
public class RepositoryTest {

    @Autowired
    PointRepository pointRepository;
    @Autowired
    private SectionRepository sectionRepository;
    @Autowired
    private ChapterRepository chapterRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private DotsRepository dotsRepository;

    @Test
    public void GetPoint() {
        List<Point> points = pointRepository.findAll();
        for (Point p:points){
            System.out.println(p.getClass());
        }
    }

    @Test
    public void getAll(){
        List<Point> Points = pointRepository.findAll();
        List<Section> Sections = sectionRepository.findAll();
        List<Chapter> Chapters = chapterRepository.findAll();
        List<Book> Books = bookRepository.findAll();
        List<Dots> dots = dotsRepository.findAll();
        List<Object> list = new ArrayList<>();
        list.addAll(Points);
        list.addAll(Sections);
        list.addAll(Chapters);
        list.addAll(Books);
        list.addAll(dots);
        System.out.println(list);
    }

    @Test
    public void findNodeById(){
        Integer id=62;
        List<Point> points = pointRepository.findAll();
        List<Section> sections = sectionRepository.findAll();
        List<Chapter> chapters = chapterRepository.findAll();
        List<Book> books = bookRepository.findAll();
        List<Dots> dots = dotsRepository.findAll();
        for (Point p : points) {
            if (p.getId() == id.longValue()) {
                System.out.println(p.getName());
            }
        }
        for (Section s : sections) {
            if (s.getId() == id.longValue()) {
                System.out.println(s.getName());
            }
        }
        for (Chapter c : chapters) {
            if (c.getId() == id.longValue()) {
                System.out.println(c.getName());
            }
        }
        for (Book b : books) {
            if (b.getId() == id.longValue()) {
                System.out.println(b.getName());
            }
        }
        for (Dots d : dots) {
            if (d.getId() == id.longValue()) {
                System.out.println(d.getName());
            }
        }
    }


    @Test
    public void update(){
        Optional<Point> point = pointRepository.findById(119L);
        Point point1 = point.get();
        point1.setName("冲突处理22");
        pointRepository.save(point1);
    }
}
