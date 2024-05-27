package com.knowledge_graph.Repository;

import com.knowledge_graph.entity.Point;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PointRepository extends Neo4jRepository<Point,Long>{
}
