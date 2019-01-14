package com.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.manager.SampleManager;
import com.demo.props.SampleProps;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "this is rest controller";
	}
	
	@GetMapping(value = "/format/{bFlag}", produces = "application/json")
	public String format(@PathVariable String bFlag) {
		SampleManager manager = new SampleManager();
		return manager.response(bFlag);
	}
	
	@GetMapping("/conf")
	public String conf() {
		SampleProps prop = new SampleProps();
		return prop.show();
	}
}
