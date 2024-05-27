package com.knowledge_graph.entity;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.Node;

/**
 * @program: springboot_ssmp
 * @description:
 * @author: Lin
 * @create: 2023-05-03 23:04
 **/
@Node(labels = "book")
public class Book  extends Nodes{

}
