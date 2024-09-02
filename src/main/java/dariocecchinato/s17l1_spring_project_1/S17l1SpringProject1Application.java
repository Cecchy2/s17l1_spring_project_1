package dariocecchinato.s17l1_spring_project_1;

import dariocecchinato.s17l1_spring_project_1.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class S17l1SpringProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(S17l1SpringProject1Application.class, args);


		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(S17l1SpringProject1Application.class);

		Menu menu= context.getBean(Menu.class);
		System.out.println(menu);

	}



}
