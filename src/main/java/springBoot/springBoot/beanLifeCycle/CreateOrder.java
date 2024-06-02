package springBoot.springBoot.beanLifeCycle;

import org.springframework.stereotype.Service;

@Service
public class CreateOrder {

	/**
	 * @Service internally contains @Component, ThereFore it's object 
	 * also created and managed by IOC container.
	 * **/
	public CreateOrder() {
	    System.err.println("Eager : CreateOrder initialized");
	}
}
