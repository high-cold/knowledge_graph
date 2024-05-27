package com.knowledge_graph.Repository;


import com.knowledge_graph.entity.Chapter;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ChapterRepository extends Neo4jRepository<Chapter,Long>{
}
