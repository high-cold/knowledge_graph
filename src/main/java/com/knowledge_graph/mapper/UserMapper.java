package com.knowledge_graph.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import com.knowledge_graph.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
