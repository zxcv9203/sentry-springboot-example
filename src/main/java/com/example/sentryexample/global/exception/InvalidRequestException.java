package com.example.sentryexample.global.exception;

import com.example.sentryexample.global.exception.model.ErrorCode;

public class InvalidRequestException extends RuntimeException{

    public InvalidRequestException(ErrorCode code) {
        super(code.getDescription());
    }
}
