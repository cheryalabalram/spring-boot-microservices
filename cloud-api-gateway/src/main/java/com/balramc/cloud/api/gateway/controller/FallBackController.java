package com.balramc.cloud.api.gateway.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

	@GetMapping(path = "/userServiceFallBack")
	public Map<String, String> userServiceFallBack() {
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("fallback","User service is taking longer than usual please try after some time...");
		return hashMap;
	}
	
	@GetMapping(path = "/departmentServiceFallBack")
	public Map<String, String> departmentServiceFallBack() {
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("fallback","Department service is taking longer than usual please try after some time...");
		return hashMap;
	}
}
