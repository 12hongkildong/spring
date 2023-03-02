package kr.co.rland.web.di;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;
import kr.co.rland.web.service.MenuService;

public class Program {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("kr/co/rland/web/di/context.xml");
		
		//여기까지 담는 것이고
//		MenuRepository menuReposiroty = context.getBean(MenuRepository.class);
//		List<Menu> list = menuReposiroty.findAll();

//		MenuService service = context.getBean(MenuService.class);
		MenuService service = (MenuService)context.getBean("service"); // 이름으로 뽑을 때는 형식변환 해줘야 하기 때문에 class로 뽑는 것
		List<Menu> list = service.getList();
		
		System.out.println(list);
		//여기는 뽑아내는 것이고
		
		
	}

}
