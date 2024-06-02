package springBoot.springBoot.beanLifeCycle;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		String[] beans = context.getBeanDefinitionNames();
		Arrays.stream(beans).forEach(bean -> {
			//System.out.println("Bean : " + bean);
		});

		/**
		 * Once we call close then @PreDestroy annotated method called. Close will close
		 * the IOC container so all the beans belong to IOC container will also be
		 * destroy.
		 */
		context.close();
	}

	@Bean
	CommandLineRunner commandLineRunner(ApplicationContext appContrext) {
		return args -> {
			String[] beans = appContrext.getBeanDefinitionNames();
			Arrays.stream(beans).forEach(bean -> {
				//System.out.println("Bean : " + bean);
			});

		};
	}

	public Application() {
		System.err.println("Eager : Application initialized");
	}
}
