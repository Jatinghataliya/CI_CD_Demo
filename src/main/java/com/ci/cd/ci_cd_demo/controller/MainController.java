package com.ci.cd.ci_cd_demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/rest")
public class MainController {

	
	private Map<String, Object> map = new HashMap<>();
	
	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public Map<String, Object> getName() {
		map.put("name", "Jatin");
		map.put("code", 200);
		map.put("status", true);
		return map;
	}
	
	@RequestMapping(value = "/getfullname",method = RequestMethod.GET, produces = "application/json")
	public Map<String, Object> getSecondName() {
		map.put("name", "Jatin Ghataliya");
		map.put("code", 200);
		map.put("status", true);
		return map;
	}
	
}
