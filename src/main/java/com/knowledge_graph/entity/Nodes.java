package com.knowledge_graph.entity;

import lombok.Data;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Property;

import java.io.Serializable;

/**
 * @program: Knowledge_graph
 * @description:
 * @author: Lin
 * @create: 2023-06-14 08:14
 **/
@Data
public class Nodes implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Property
    private String _csv_id;
    @Property
    private String name;
    @Property
    private String url;
    @Property
    private String definition;
    @Property
    private String feature;
    @Property
    private String page;
}
