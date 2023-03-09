package kr.co.rland.web.repository.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;

public class MbMenuRepository2 implements MenuRepository {
	
	@Autowired
	private SqlSession session;
	
	@Override
	public List<Menu> findAll() {
		MenuRepository repository = session.getMapper(MenuRepository.class);
		return repository.findAll(0,10,null,null,null,null,null);
	}
	
	@Override
	public List<Menu> findAll(Integer offset, Integer size) {
		MenuRepository repository = session.getMapper(MenuRepository.class);
		// TODO Auto-generated method stub
		return repository.findAll(offset,size,null,null,null,null,null);
	}
	
	@Override
	public List<Menu> findAll(Integer offset, Integer size, String query, Integer categoryId, Integer price,
			String orderField, String orderDir) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Menu> findAllByIds(List<Long> ids) {
		MenuRepository repository = session.getMapper(MenuRepository.class);
		//List<Menu> list = session.selectList("kr.co.rland.web.repository.MenuRepository.findAllByIds", ids);
		
		//return list;
		return repository.findAllByIds(ids);
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
