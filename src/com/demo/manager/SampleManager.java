package com.demo.manager;

import org.springframework.stereotype.Service;

import com.demo.exceptions.AnotherCustomException;
import com.demo.exceptions.CustomException;
import com.demo.responses.FailureResponse;
import com.demo.responses.SuccessResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@Service
public class SampleManager {
	
	public String response(String flag) {
		String output = "";
		if("true".equals(flag)) {
			SuccessResponse succResp = new SuccessResponse();
			output = jsonFormat(succResp);
		} else if("false".equalsIgnoreCase(flag)) {
			FailureResponse failResp = new FailureResponse();
			output = jsonFormat(failResp);
		}
		else {
			output = "incorrect parameter";
		}
		return output;
	}
	
	private String jsonFormat(Object obj) {
		try {
			String klassName = obj.getClass().toString();
			Object klass = Class.forName(klassName.split(" ")[1]).newInstance();
			ObjectMapper mapper = new ObjectMapper();
			mapper.enable(SerializationFeature.INDENT_OUTPUT);
			return mapper.writeValueAsString(klass);
		} catch(Exception ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
			return "JSON parsing error";
		}
	}

	public String process(boolean flag) {
		if(flag) {
			throw new CustomException("custom exception message");
		} 
		if(!flag) {
			throw new AnotherCustomException("another custom exception message");
		}
		return String.valueOf(flag);
	}
}
