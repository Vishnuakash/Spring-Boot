package springBoot.springBoot.beanLifeCycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TicketBean {

	@Bean
	public FlightInformation createTicket() {
		return new FlightInformation(10);
	}
}
