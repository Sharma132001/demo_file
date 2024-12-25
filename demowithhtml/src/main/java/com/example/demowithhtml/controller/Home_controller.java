package com.example.demowithhtml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Home_controller {
	@GetMapping("/about")
	public String get() {
		return "index";
	}
}
