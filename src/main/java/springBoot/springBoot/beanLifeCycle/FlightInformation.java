package springBoot.springBoot.beanLifeCycle;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Lazy
public class FlightInformation {

	private int id;

	public FlightInformation() {
		System.err.println("Lazy : FlightInformation initialized");
	}

	public FlightInformation(int id) {
		this.id = id;
		System.err.println("Eager : FlightInformation initialized with id " + id);
	}

	@PostConstruct
	public void initialized() {
		System.err.println("FlightInformation Post construct called");
	}

	@PreDestroy
	public void preDestroy() {
		System.err.println("FlightInformation  pre destroy called");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
