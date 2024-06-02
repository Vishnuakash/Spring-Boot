package springBoot.springBoot.dynamically.initializing_2.bean.copy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

	public AppConfiguration() {
		System.err.println("Eager : AppConfiguration initialized");
	}

	/**
	 * Here @Value is used to inject value from various source like properties file,
	 * environment variable and inline literals.
	 * 
	 * paymentMethod : upiPayment, is added in application.properties file. So here
	 * by default it will always take paymentMethod based on configuration.
	 * 
	 * 
	 */
	@Bean
	public Payment createPayment(@Value("$paymentMethod") String paymentMethod) {
		Payment response = null;
		if (paymentMethod.equals("creditCardPayment"))
			response = new CreditCardPayment();
		if (paymentMethod.equals("rupayCardPayment"))
			response = new RupayCardPayment();
		if (paymentMethod.equals("upiPayment"))
			response = new UPIPayment();
		if (paymentMethod.equals("internetBankingPayment"))
			response = new InternetBankingPayment();
		return response;
	}
}
