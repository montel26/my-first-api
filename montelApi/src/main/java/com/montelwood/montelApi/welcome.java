package com.montelwood.montelApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcome {
	
	@GetMapping("/")
	public String welcome() {
		return "hello there";
	}

}
