package kr.co.rland.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class HomeController {

	@RequestMapping("/index")     // 어노테이션)
	public String index() {
		return "/WEB-INF/view/index.jsp";
	}
}
