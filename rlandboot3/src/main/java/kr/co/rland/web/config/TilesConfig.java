package kr.co.rland.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@Configuration
public class TilesConfig {
	
	@Bean  //리졸브 깨우기
	public UrlBasedViewResolver tilesViewResolver() {
		UrlBasedViewResolver resolver = new UrlBasedViewResolver();
		resolver.setViewClass(TilesView.class); //뷰리절브로서의 역할을 하는 거
		resolver.setOrder(1);// 뷰리절브보다 타일리절브를 먼저 실행하도록 씰행순서 바꾸기
		return resolver;
	}
	
	// ㄹ졸브 설정파일 위치 알려주기
	public TilesConfigurer tilesConfigurer() {
		TilesConfigurer configurer = new TilesConfigurer();
		configurer.setDefinitions(new String[] {"/WEB-INF/tiles.xml"});
		
		return configurer;
	}
	
}
