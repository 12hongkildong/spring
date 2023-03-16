package kr.co.rland.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
 
@RequestMapping("/menu")
public class MenuController {

	@GetMapping("list") 
	public String list() {
		//return "menu list";
		//return "/WEB-INF/view/menu/list.jsp";
		//return "/WEB-INF/view/inc/layout.jsp";
		return "menulist";//타일에게 조립해달라는 조합에 대한 이름을 반환
		
	}

	@GetMapping("detail") 
	public String detail() {
		return "menu detail";
	}
}
