package com.demo.props;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class SampleProps {

	@Value("${app.name}")
	private String name;
	
	@Autowired
	private Environment env;
	
	public String show() {
		System.out.println(env.getProperty("app.name"));
		return this.name;
	}
}
