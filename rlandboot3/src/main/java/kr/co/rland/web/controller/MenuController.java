package kr.co.rland.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.entity.MenuView;
import kr.co.rland.web.service.MenuService;


@Controller
@RequestMapping("/menu")
public class MenuController {
	@Autowired
	private MenuService service;
	
	@GetMapping("list") 
	public String list(Model model) {
		
		List<MenuView> list = service.getViewList();
		model.addAttribute("list", list);
		
//		service.getList(); //1, quert:"", category:null
//		service.getList(1);
//		service.getList(1, "");
//		service.getList(1, 1 );
//		service.getList(1, 1,"" );
		
		
		//model.addAttribute("data", "hello");
		//return "menu list";
		//return "/WEB-INF/view/menu/list.jsp";
		//return "/WEB-INF/view/inc/layout.jsp";
		return "menu/list";//타일에게 조립해달라는 조합에 대한 이름을 반환
		
	}

	@GetMapping("detail") 
	public String detail(int id, Model model) {
		
		Menu menu = service.getById(id);
		
		model.addAttribute("menu", menu);
		
		return "menu/detail";
	}
}
