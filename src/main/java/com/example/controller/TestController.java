package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping(path = "/testing", method = RequestMethod.GET, produces = "application/json")
	public String getMapping() {
		return "Response from service 2";
	}

	@RequestMapping(path = "/health", method = RequestMethod.GET, produces = "application/json")
	public String health() {
		return "OK";
	}

}
