package com.stackroute.recommendation.service;

import com.stackroute.recommendation.domain.Search;
import com.stackroute.recommendation.domain.SearchFrequency;
import com.stackroute.recommendation.exceptions.SearchAlreadyExistsException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/*Search service interface*/
@Service
public interface SearchService {
    public Search saveSearch(Search searchString) throws SearchAlreadyExistsException;
    public List<Search> getAllSearch();
    public List<SearchFrequency> getRecommendations();
    public HashMap countFreq(List<Search> allquestions, int n);
    public  HashMap<Search, Integer> sortByValue(HashMap<Search, Integer> allquestions);
}
