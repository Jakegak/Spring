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
	
	@Bean(name="1")
	public Address getAddress1(){
		return new Address("Thika road");
	}
	
	@Bean(name="2")
	public Address getAddress2(){
		return new Address("Mwiki road");
	}
}
