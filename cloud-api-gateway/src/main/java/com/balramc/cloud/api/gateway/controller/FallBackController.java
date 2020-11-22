package com.balramc.cloud.api.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

	@GetMapping(path = "/userServiceFallBack")
	public String userServiceFallBack() {
		return "User service is taking longer than usual please try after some time";
	}
	
	@GetMapping(path = "/departmentServiceFallBack")
	public String departmentServiceFallBack() {
		return "Department service is taking longer than usual please try after some time";
	}
}
