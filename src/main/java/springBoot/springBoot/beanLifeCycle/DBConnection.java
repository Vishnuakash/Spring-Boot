package springBoot.springBoot.beanLifeCycle;

import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Repository
public class DBConnection {

	public DBConnection() {
	   System.err.println("Eager : DBConnection initialized");	
	}

	@PostConstruct
	public void initialized() {
		System.err.println("DBConnection Post construct called");
	}

	@PreDestroy
	public void preDestroy() {
		System.err.println("DBConnection pre destroy called. DBConnection bean is about to destroy"
				+ "before the bean is destroy we have to release all connections and resources.");
	}

}
