package kr.co.rland.web.controller.admin;


import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;


@Controller("adminMenuController")
@RequestMapping("/admin/menu")
public class MenuController {

	@GetMapping("list")
	public String list(@RequestParam(name="p", defaultValue = "1") int page, 
			@RequestParam(name="q", required=false) String query,
			@CookieValue("my") String myCookie,
			@RequestHeader("Accept-Language") String language
			) throws UnsupportedEncodingException {
		
		System.out.printf("Accept-Language: %s\n", language);
//		String myCookie = "";
//		Cookie[] cookies = request.getCookies();
//		for(Cookie cookie : cookies)
//			if(cookie.getName().equals("my")) {
//				myCookie = cookie.getValue();
//				break;
//			}
		
		System.out.println(language);
		myCookie = URLDecoder.decode(myCookie, "utf-8");
		//System.out.println(myCookie);
		
		
		
		System.out.printf("page: %d, query: %s\n", page, query);
		return "/WEB-INF/view/admin/menu/list.jsp";
	}
	
	@GetMapping("detail")
	public String detail() {
		return "admin detail3";
	}
	
	//  /admin/men/reg -> 얘가 다 이긴다/.
	//  /admin/men/reg.html
	//  /admin/men/reg.jsp 
	
	
	// 등록폼을 주세요
//	@RequestMapping("reg") // -> service():get/Post를 다 처리하는 매핑
	@GetMapping("reg")
	public String reg() {
		return "/WEB-INF/view/admin/menu/reg.jsp";
	}
	
	// 폼입력해서 제출이요
//	@RequestMapping("reg")
	@PostMapping("reg")
	public String reg(String title) {
		// 등록하고
		System.out.println("메뉴 등록 완료");
		return "redirect:list";
	}
	
	
}
