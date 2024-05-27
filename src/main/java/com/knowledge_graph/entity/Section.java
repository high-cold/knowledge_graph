package com.knowledge_graph.entity;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.Node;

/**
 * @program: demo
 * @description:
 * @author: Lin
 * @create: 2023-04-19 21:45
 **/
@Node(labels = "section")
public class Section  extends Nodes {

}
