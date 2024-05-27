package com.knowledge_graph.Repository;

import com.knowledge_graph.entity.Nodes;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodesRepository extends Neo4jRepository<Nodes,Long> {
}
