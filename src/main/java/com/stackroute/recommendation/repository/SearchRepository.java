package com.stackroute.recommendation.repository;

import com.stackroute.recommendation.domain.Search;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchRepository extends MongoRepository<Search, String> {
        public boolean existsBySessionId(String sessionId);
}
