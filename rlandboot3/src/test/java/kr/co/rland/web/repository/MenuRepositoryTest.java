package kr.co.rland.web.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

import kr.co.rland.web.entity.Menu;

@AutoConfigureTestDatabase(replace = Replace.NONE)
@MybatisTest
class MenuRepositoryTest {

	@Autowired
	private MenuRepository repository;
	
	@Test
	void testFindAll() {
		List<Menu> list = repository.findAll(0, 10);
		System.out.println(list);
	}
	
	//@Test
	//void testFindAll() {
	//	List<Menu> list = repository.findAll(0, 10, null, null, null, "regDate", "desc");
	//	System.out.println(list);
	//}

//	@Test
	void testUpdate() {
		Menu menu = new Menu();
		menu.setId(856L);
		menu.setName("러시아노");
		
		repository.update(menu);
	}
	
	//@Test  // 이부분을 주석처리해주면 실행을 안한다.
	void testFindAllByIds() { //이름은 아무거나 해도 되는데 알아보기 슆게 그냥
		List<Long> ids = new ArrayList<>();
		ids.add(616L);
		ids.add(617L);
		ids.add(713L);
		ids.add(737L);
		
		List<Menu> list = repository.findAllByIds(ids);
		System.out.println(list); //리스트컬렉션
	}
	
}
