package springBoot.springBoot.beanLifeCycle;

import org.springframework.stereotype.Repository;

@Repository
public class Payment {

	/**
	 * @Repository internally contains @Component, ThereFore it's object also created
	 * and managed by IOC Container.
	 * */
	public Payment() {
        System.err.println("Eager : Payment initialized");
	}
}
