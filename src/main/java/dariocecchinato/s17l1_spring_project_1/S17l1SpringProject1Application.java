package dariocecchinato.s17l1_spring_project_1;

import dariocecchinato.s17l1_spring_project_1.entities.Bevanda;
import dariocecchinato.s17l1_spring_project_1.entities.Menu;
import dariocecchinato.s17l1_spring_project_1.entities.Pizza;
import dariocecchinato.s17l1_spring_project_1.entities.Topping;
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

		Pizza margherita = (Pizza) context.getBean("margherita");
		System.out.println(margherita);

		Pizza hawaianPizza = (Pizza) context.getBean("hawaianPizza");
		System.out.println(hawaianPizza);

		Pizza salamiPizza = (Pizza) context.getBean("salamiPizza");
		System.out.println(salamiPizza);

		Bevanda lemonade = (Bevanda) context.getBean("lemonade");
		System.out.println(lemonade);

		Bevanda water = (Bevanda) context.getBean("water");
		System.out.println(water);

		Bevanda wine = (Bevanda) context.getBean("wine");
		System.out.println(wine);

		Topping tomato = (Topping) context.getBean("tomato");
		System.out.println(tomato);

		Topping cheese = (Topping) context.getBean("cheese");
		System.out.println(cheese);

		Topping ham = (Topping) context.getBean("ham");
		System.out.println(ham);

		Topping onions = (Topping) context.getBean("onions");
		System.out.println(onions);

		Topping pineapple = (Topping) context.getBean("pineapple");
		System.out.println(pineapple);

		Topping salami = (Topping) context.getBean("salami");
		System.out.println(salami);



	}
}
