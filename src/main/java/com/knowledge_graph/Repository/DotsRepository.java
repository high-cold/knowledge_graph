package com.knowledge_graph.Repository;


import com.knowledge_graph.entity.Dots;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DotsRepository extends Neo4jRepository<Dots,Long> {
}
