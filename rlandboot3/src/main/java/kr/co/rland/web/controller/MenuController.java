package kr.co.rland.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
 
@RequestMapping("/menu")
public class MenuController {

	@GetMapping("list") 
	public String list() {
		return "menu list";
	}

	@GetMapping("detail") 
	public String detail() {
		return "menu detail";
	}
}
