package com.andrbezr2016.backend.client.exception;

import lombok.Data;

@Data
public class ErrorResponse {

    private int status;
    private String message;
}
