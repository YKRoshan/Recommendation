package com.stackroute.recommendation.service;

import com.stackroute.recommendation.domain.NlpResult;
import com.stackroute.recommendation.domain.NlpResultFrequency;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public interface NlpResultService {
    public NlpResult saveNlpResult(NlpResult nlpResult);
    public List<NlpResult> getAllNlpResult();
    public List<NlpResultFrequency> getConcepts();
    public  HashMap<NlpResult, Integer> sortByValue(HashMap<NlpResult, Integer> nlpresult);
    public HashMap countFreq(List<NlpResult> nlpresult, int n);

}
