package com.knowledge_graph.controller;

import com.knowledge_graph.Repository.*;
import com.knowledge_graph.controller.utils.R;
import com.knowledge_graph.entity.*;
import com.knowledge_graph.service.JuleiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.soap.Node;
import java.util.*;

/**
 * @program: demo
 * @description:
 * @author: Lin
 * @create: 2023-04-21 23:04
 **/
@RestController
@RequestMapping("/display")
public class NodesController {

    @Autowired
    private PointRepository pointRepository;
    @Autowired
    private SectionRepository sectionRepository;
    @Autowired
    private ChapterRepository chapterRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private DotsRepository dotsRepository;
    @Autowired
    private JuleiService juleiService;

    @GetMapping("{name}")
    @RequestMapping("/name")
    public R getIdByName(@PathVariable String name) {
        List<Point> all1 = pointRepository.findAll();
        List<Section> all2 = sectionRepository.findAll();
        List<Chapter> all3 = chapterRepository.findAll();
        List<Book> all4 = bookRepository.findAll();
        List<Dots> all5 = dotsRepository.findAll();
        for (Point p : all1) {
            if (p.getName() == name) {
                return new R(true, p);
            }
        }
        for (Section s : all2) {
            if (s.getName() == name) {
                return new R(true, s);
            }
        }
        for (Chapter c : all3) {
            if (c.getName() == name) {
                return new R(true, c);
            }
        }
        for (Book b : all4) {
            if (b.getName() == name) {
                return new R(true, b);
            }
        }
        for (Dots d : all5) {
            if (d.getName() == name) {
                return new R(true, d);
            }
        }
        return new R(false);
    }

    /**
     * 根据id获取节点
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public R getById(@PathVariable Integer id) {
        List<Point> points = pointRepository.findAll();
        List<Section> sections = sectionRepository.findAll();
        List<Chapter> chapters = chapterRepository.findAll();
        List<Book> books = bookRepository.findAll();
        List<Dots> dots = dotsRepository.findAll();
        for (Point p : points) {
            if (p.getId() == id.longValue()) {
                return new R(true, p);
            }
        }
        for (Section s : sections) {
            if (s.getId() == id.longValue()) {
                return new R(true, s);
            }
        }
        for (Chapter c : chapters) {
            if (c.getId() == id.longValue()) {
                return new R(true, c);
            }
        }
        for (Book b : books) {
            if (b.getId() == id.longValue()) {
                return new R(true, b);
            }
        }
        for (Dots d : dots) {
            if (d.getId() == id.longValue()) {
                return new R(true, d);
            }
        }
        return new R(false);
    }

    /**
     * 获取全部结点
     * @return
     */
    @GetMapping
    public R getAll() {
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
        return new R(true, list);
    }

    /**
     * 新增Point结点
     * @param point
     * @return
     */
    @PostMapping
    @RequestMapping("/point")
    public R savePoint(@RequestBody Point point) {
        pointRepository.save(point);
        return new R(true, "添加成功!");
    }

    /**
     * 新增section节点
     * @param section
     * @return
     */
    @PostMapping
    @RequestMapping("/section")
    public R saveSection(@RequestBody Section section) {
        sectionRepository.save(section);
        return new R(true, "添加成功!");
    }

    /**
     * 新增Chapter结点
     * @param chapter
     * @return
     */
    @PostMapping
    @RequestMapping("/chapter")
    public R saveChapter(@RequestBody Chapter chapter) {
            chapterRepository.save(chapter);
        return new R(true, "添加成功!");
    }

    /**
     * 修改结点
     * @param point
     * @return
     */
    @PostMapping ("/update/point")
    public R updateNodeById(@RequestBody Point point){
        pointRepository.save(point);
        return new R(true,"修改成功!");
    }

    @GetMapping("/julei")
    public R getALLJulei(){
        List<Julei> list = juleiService.list();
        return new R(true,list);
    }

    @GetMapping("/julei/name")
     public R getByNameOrderByLevel(String name){
        Julei julei = juleiService.query().eq("name", name).one();
        LevelClass levelClass = new LevelClass();
        levelClass.setName(name);

        if (Objects.equals(julei.no1, "优秀 ")){
            levelClass.A.add("绪论");
        }else if (Objects.equals(julei.no1, "良好 ")){
            levelClass.B.add("绪论");
        }else{
            levelClass.C.add("绪论");
        }

        if (Objects.equals(julei.no2, "优秀 ")){
            levelClass.A.add("线性表");
        }else if (Objects.equals(julei.no2, "良好 ")){
            levelClass.B.add("线性表");
        }else{
            levelClass.C.add("线性表");
        }

        if (Objects.equals(julei.no3, "优秀 ")){
            levelClass.A.add("栈与队列");
        }else if (Objects.equals(julei.no3, "良好 ")){
            levelClass.B.add("栈与队列");
        }else{
            levelClass.C.add("栈与队列");
        }

        if (Objects.equals(julei.no4, "优秀 ")){
            levelClass.A.add("数组与矩阵");
        }else if (Objects.equals(julei.no4, "良好 ")){
            levelClass.B.add("数组与矩阵");
        }else{
            levelClass.C.add("数组与矩阵");
        }

        if (Objects.equals(julei.no5, "优秀 ")){
            levelClass.A.add("树与二叉树");
        }else if (Objects.equals(julei.no5, "良好 ")){
            levelClass.B.add("树与二叉树");
        }else{
            levelClass.C.add("树与二叉树");
        }

        if (Objects.equals(julei.no6, "优秀 ")){
            levelClass.A.add("图");
        }else if (Objects.equals(julei.no6, "良好 ")){
            levelClass.B.add("图");
        }else{
            levelClass.C.add("图");
        }

        if (Objects.equals(julei.no7, "优秀 ")){
            levelClass.A.add("排序");
        }else if (Objects.equals(julei.no7, "良好 ")){
            levelClass.B.add("排序");
        }else{
            levelClass.C.add("排序");
        }

        if (Objects.equals(julei.no8, "优秀")){
            levelClass.A.add("查找");
        }else if (Objects.equals(julei.no8, "良好")){
            levelClass.B.add("查找");
        }else{
            levelClass.C.add("查找");
        }

        return new R(true,levelClass);
    }


}
