package com.stackroute.recommendation.exceptions;

public class SearchNotFoundException extends Exception {
    private String message;

    public SearchNotFoundException() {
    }

    public SearchNotFoundException(String message) {
        super(message);
        this.message = message;
    }
}
