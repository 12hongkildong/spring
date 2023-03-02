
package kr.co.rland.web.repository.jdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.stereotype.Component;

import com.zaxxer.hikari.HikariDataSource;

import kr.co.rland.web.entity.Menu;
import kr.co.rland.web.repository.MenuRepository;

@Component
public class JdbcMenuRepository implements MenuRepository{

	@Override
	public List<Menu> findAll() {
		
		String sql = String.format("select id, name, price, regDate, categoryId from menu"); // 라이브러리가 할 수 없다.
		
		//DataSource dataSource = new HikariDataSource(); // 이것도 우릴가 만들어 넘겨줘야 된다. 자동으로 인식 뫃함
		//기본 데이터소스객체는 못 찾고, 히카리를 씨기로 함
		//데이터 소스
		
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.mariadb.jdbc.Driver"); // 사용자 계정
        dataSourceBuilder.url("jdbc:mariadb://db.newlecture.com:3306/rlanddb");
        dataSourceBuilder.username("rland"); // 이 부분을 고쳐 쓰면 도니다.
        dataSourceBuilder.password("20220823");
		
        DataSource dataSource = dataSourceBuilder.build();
		
		JdbcTemplate template = new JdbcTemplate(dataSource); // 템플릿 라이브러리
		
		List<Menu> list = template.query(sql, new BeanPropertyRowMapper(Menu.class));
		
		
		
		
		return list;
	}
	
	
//   @Override
//   public List<Menu> findAll() {
//      // TODO Auto-generated method stub
//
//      String sql = String.format("select id, name, price, regDate, categoryId from menu");
//      List<Menu> list = new ArrayList<>();
//
//      try {
//         Class.forName("org.mariadb.jdbc.Driver");
//         String url = "jdbc:mariadb://db.newlecture.com:3306/rlanddb";
//         Connection con = DriverManager.getConnection(url, "rland", "20220823");
//         //con.setAutoCommit(false);
//         Statement st = con.createStatement();
//         ResultSet rs = st.executeQuery(sql);
//
//         // 필터링, 집계, 정렬
//         while (rs.next()) // 서버의 커서를 한칸 내리고 그 위치의 레코드를 옮겨 오는 것. -> 레코드 하나가 저장되는 공간은?
//         {
//            int id = rs.getInt("id");
//            String name = rs.getString("name");
//            int price = rs.getInt("price");
//            Date regDate = rs.getDate("regDate");
//            int categoryId = rs.getInt("categoryId");
//            Menu menu = new Menu(id, name, price, regDate, categoryId, 1);
//            list.add(menu);
//         }
////         con.commit();
//         con.close();
//      } catch (Exception e) {
////    	  con.rollback();
//         e.printStackTrace();
//      }
//      return list;
//
//   }
}
