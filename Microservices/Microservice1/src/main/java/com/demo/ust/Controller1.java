package com.demo.ust;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller1 {
	
	@GetMapping("/")
	public Config retrieveConfig()
	{
		return new Config(5,1);
	}

}
