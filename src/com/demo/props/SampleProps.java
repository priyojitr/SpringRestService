package com.demo.props;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class SampleProps {
	
	@Autowired
	public Environment environment;

	private final String PROPERTY_APP_NAME = "app.name";
	
	private String name;
	
	public SampleProps() {
		// TODO Auto-generated constructor stub
//		setEnvProp();
	}
	
	public void setEnvProp() {
		this.name = environment.getProperty(PROPERTY_APP_NAME);
	}
	
	public void show() {
		setEnvProp();
		System.out.println(this.name);
		
	}
}
