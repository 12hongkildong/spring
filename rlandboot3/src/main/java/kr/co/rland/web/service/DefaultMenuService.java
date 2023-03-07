package kr.co.rland.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;

@Service
public class DefaultMenuService implements MenuService {

	@Autowired
	private MenuRepository repository;
	
	
	
	
	@Override
	public List<Menu> getList() {
		// TODO Auto-generated method stub
		System.out.println("아아아");
		return repository.findAll(0,10,"",1,3000,"regDate","desc");
	}


}
