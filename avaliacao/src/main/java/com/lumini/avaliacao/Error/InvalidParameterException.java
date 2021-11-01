package com.lumini.avaliacao.Error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

public class InvalidParameterException extends ResponseStatusException {
    public InvalidParameterException(String message) {
        super(HttpStatus.BAD_REQUEST, message);
    }
}
