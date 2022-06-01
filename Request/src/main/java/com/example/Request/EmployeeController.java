package com.example.Request;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@org.springframework.web.bind.annotation.RestController
public class EmployeeController {
	
	@PostMapping(value = "/numberOneAPI")
	public Map<String, Object> numberOneAPI(@RequestBody Map<String, Object> request) throws Exception {

		return request;
	}

	@PostMapping(value = "/numberTwoAPI")
	public Map<String, Object> numberTwoAPI(@RequestBody Map<String, Object> request) throws Exception {

		return request;
	}

}
