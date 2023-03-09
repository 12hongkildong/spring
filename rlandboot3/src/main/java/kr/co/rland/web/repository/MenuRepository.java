package kr.co.rland.web.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.co.rland.web.entity.Menu;

@Mapper      //실제로 우리가 만들어보자  //0309 이거 주석처리
public interface MenuRepository {
//	List<Menu> findAll();
//	List<Menu> findAll(Integer offset,Integer size);
   List<Menu> findAll(Integer offset, 
		   				Integer size,
		   				String query,
		   				Integer categoryId,
		   				Integer price,
		   				String orderField,
		   				String orderDir);
   List<Menu> findAllByIds(List<Long> ids);
   Menu findById(long id);
   int count(
		   	String query,
			Integer categoryId,
			Integer price);
   Menu insert(Menu menu);
   Menu update(Menu menu);
   void delete(long id);
   
}