package com.stackroute.recommendation.exceptions;

public class SearchAlreadyExistsException extends Exception {
    private String message;

    public SearchAlreadyExistsException() {
    }

    public SearchAlreadyExistsException(String message) {
        super(message);
        this.message = message;
    }
}
