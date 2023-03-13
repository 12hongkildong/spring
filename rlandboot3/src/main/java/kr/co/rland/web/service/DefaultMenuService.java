package kr.co.rland.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;

@Component
public class DefaultMenuService implements MenuService {

	@Autowired
	private MenuRepository repository;
	
	public void setRepository(MenuRepository repository) {
		this.repository = repository;
	}
	
	
	@Override
	public List<Menu> getList() {
		// TODO Auto-generated method stub
		return repository.findAll(0,10,"",1,null,"regDate","desc");
//		return repository.findAll(0,10,"",null,null,"regDate","desc");
	}

	@Transactional
	@Override
	public void pointUp() {
		Menu menu = new Menu();
		menu.setId(915L);
		menu.setPrice(5000);
		repository.update(menu);
		
		menu.setId(915L);
		menu.setPrice(5000000);
		repository.update(menu);	
	}


}
