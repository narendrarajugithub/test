package com.ust.test.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	public ArrayList<String> getResponse(){
		ArrayList<String> names=new ArrayList<>();
		names.add("narendra");
		names.add("ravi");
		names.size();
		
		return names;
	}

}
