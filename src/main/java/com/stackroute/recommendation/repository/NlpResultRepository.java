package com.stackroute.recommendation.repository;

import com.stackroute.recommendation.domain.NlpResult;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NlpResultRepository  extends MongoRepository<NlpResult, String> {
}
