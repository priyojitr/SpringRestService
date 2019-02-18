package com.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.manager.SampleManager;
import com.demo.props.SampleProps;

@RestController
public class HomeController {

	@Autowired
	SampleProps prop;
	
	@Autowired
	SampleManager manager;

	@GetMapping("/")
	public String home() {
		return "this is rest controller";
	}

	@GetMapping(value = "/format1/{bFlag}", produces = "application/json")
	public String format(@PathVariable String bFlag) {
		return manager.response(bFlag);
	}

	@GetMapping(value = "/format/{bFlag}", 
			consumes = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE }, 
			produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	public String func1(@PathVariable boolean bFlag) {
		return manager.process(bFlag);
	}

	@GetMapping("/conf")
	public String conf() {
//		SampleProps prop = new SampleProps();
		prop.show();
		return "see log";
	}
}
