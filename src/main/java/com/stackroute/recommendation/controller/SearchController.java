package com.stackroute.recommendation.controller;

import com.stackroute.recommendation.domain.NlpResult;
import com.stackroute.recommendation.domain.Search;
import com.stackroute.recommendation.exceptions.SearchAlreadyExistsException;
import com.stackroute.recommendation.service.NlpResultService;
import com.stackroute.recommendation.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/")
public class SearchController {

    private SearchService searchStringService;
    private NlpResultService nlpResultService;

    @Autowired
    public SearchController(SearchService searchStringService, NlpResultService nlpResultService) {
        this.searchStringService = searchStringService;
        this.nlpResultService=nlpResultService;
    }

    @PostMapping("searchString")
    public ResponseEntity<?> savedSearch(@RequestBody Search searchString){
         ResponseEntity responseEntity;
         try {
             searchStringService.saveSearch(searchString);
             responseEntity = new ResponseEntity<String>("Successfully created", HttpStatus.CREATED);

         }catch (SearchAlreadyExistsException e){
             responseEntity=new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);

         }
         return responseEntity;
    }
    @GetMapping("searchString")
    public ResponseEntity<?> getAllSearch(){

        return new ResponseEntity<>(searchStringService.getAllSearch(), HttpStatus.OK);
    }


    @GetMapping("recommendation")
    public ResponseEntity<?> getRecommendation(){

        return new ResponseEntity<>(searchStringService.getRecommendations(), HttpStatus.OK);
    }

    @PostMapping("concept")
    public ResponseEntity<?> savedNlpResult(@RequestBody NlpResult nlpResult){
        ResponseEntity responseEntity;
        try {
            nlpResultService.saveNlpResult(nlpResult);
            responseEntity = new ResponseEntity<String>("Successfully created", HttpStatus.CREATED);

        }catch (Exception e){
            responseEntity=new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);

        }
        return responseEntity;
    }

    @GetMapping("concepts")
    public ResponseEntity<?> getConcepts(){

        return new ResponseEntity<>(nlpResultService.getConcepts(), HttpStatus.OK);
    }

}
