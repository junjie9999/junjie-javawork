package com.qa.demo.exception;

import javax.persistence.EntityNotFoundException;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class BandNotFoundException extends EntityNotFoundException {
    // TODO
}
