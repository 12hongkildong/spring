package kr.co.rland.web.repository.mybatis;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;

public class MbMenurepository implements MenuRepository{
	
	@Autowired
	private SqlSession session;

	@Override
	public List<Menu> findAll() {
		MenuRepository menuDao = session.getMapper(MenuRepository.class);
		return menuDao.findAll();
	}

	@Override
	public Menu findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Menu insert(Menu menu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Menu update(Menu menu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}



}
