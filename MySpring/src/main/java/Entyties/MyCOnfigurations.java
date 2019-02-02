package Entyties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyCOnfigurations {

	@Bean(name="student_bean")
	@Scope(value="singleton")
	public Student getstudentName(){
		return new Student();
	}
	
	@Bean
	public Address getAddress(){
		return new Address();
	}
}
