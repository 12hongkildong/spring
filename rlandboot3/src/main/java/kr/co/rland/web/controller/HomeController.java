package kr.co.rland.web.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.springframework.beans.propertyeditors.URLEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/") 
public class HomeController {

	@PostMapping("upload") // 파일 올릴려고 하는 사람이니까 get이; 아니라 post
	@ResponseBody
	public String upload(MultipartFile img) {
		System.out.println(img);
		return "업로드 완료";
	}
	
	
	@RequestMapping("index")     // 어노테이션)
	public String index(Model model, HttpServletResponse response) throws UnsupportedEncodingException {
		
		//String data = "hello Data";
		
		String data = URLEncoder.encode("cookie 지롱~", "utf-8");
		System.out.println(data);
		Cookie cookie = new Cookie("my", data);
		response.addCookie(cookie);
		
		model.addAttribute("data", data);
		
		return "/WEB-INF/view/index.jsp";
		
	
	}
}
