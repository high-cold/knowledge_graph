package com.knowledge_graph.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.knowledge_graph.entity.Julei;
import com.knowledge_graph.entity.User;
import com.knowledge_graph.mapper.JuleiMapper;
import com.knowledge_graph.mapper.UserMapper;
import com.knowledge_graph.service.IUserService;
import com.knowledge_graph.service.JuleiService;
import org.springframework.stereotype.Service;

/**
 * @program: Knowledge_graph
 * @description:
 * @author: Lin
 * @create: 2023-10-08 17:58
 **/
@Service
public class JuleiServiceImpl extends ServiceImpl<JuleiMapper, Julei> implements JuleiService {
}
