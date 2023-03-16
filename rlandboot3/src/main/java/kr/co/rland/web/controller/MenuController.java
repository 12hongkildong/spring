package kr.co.rland.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
 
@RequestMapping("/menu")
public class MenuController {

	@GetMapping("list") 
	public String list(Model model) {
		
		model.addAttribute("data", "hello");
		
		//return "menu list";
		//return "/WEB-INF/view/menu/list.jsp";
		//return "/WEB-INF/view/inc/layout.jsp";
		return "menu/list";//타일에게 조립해달라는 조합에 대한 이름을 반환
		
	}

	@GetMapping("detail") 
	public String detail() {
		return "menu detail";
	}
}
