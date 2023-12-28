package com.onesoft.product.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

	
@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(PriceNotFound.class)
	public ResponseEntity<Object>PriceNotFoundhandling(PriceNotFound p){
		return new ResponseEntity<>(p.getMessage(),HttpStatus.NOT_FOUND);
	}
}


