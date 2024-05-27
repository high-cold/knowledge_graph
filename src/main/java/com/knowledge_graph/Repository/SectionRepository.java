package com.knowledge_graph.Repository;

import com.knowledge_graph.entity.Section;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository extends Neo4jRepository<Section,Long>{
}
