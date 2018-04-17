package SpringBoot_jsp.springbootJsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot的启动类
 * 自动启动内置的tomcat
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
public class ApplicationMain {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationMain.class,args);
	}

}
