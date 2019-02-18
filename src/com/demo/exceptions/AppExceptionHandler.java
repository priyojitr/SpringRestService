package com.demo.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(CustomException.class)
	public ResponseEntity<?> handleCustomEx(HttpServletRequest request, CustomException ex) {
		System.out.println(request.toString());
		return ResponseEntity.status(HttpStatus.OK).body(ex.getMessage());
	}
	
	@ExceptionHandler(AnotherCustomException.class)
	public ResponseEntity<?> handleEx(HttpServletRequest req, AnotherCustomException ex){
		System.out.println(ex.toString());
		return ResponseEntity.status(HttpStatus.OK).body(ex.getMessage());
	}
}
