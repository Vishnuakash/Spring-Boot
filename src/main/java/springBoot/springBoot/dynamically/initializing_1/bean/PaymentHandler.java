package springBoot.springBoot.dynamically.initializing_1.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/payment")
public class PaymentHandler {

	public PaymentHandler() {
		System.err.println("Eager : Payment initialized");
	}
	
	@Autowired
	@Qualifier(value = "CreditCardPayment")
	Payment creditCardPayment;
	
	@Autowired
	@Qualifier(value = "RupayCardPayment")
	Payment rupayCardPayment;
	
	@Autowired
	@Qualifier(value = "UPIPayment")
	Payment upiPayment;
	
	@Autowired
	@Qualifier(value = "InternetBankingPayment")
	Payment internetBankingPayment;
	
	@PostMapping(path = "/processPayment")
	public ResponseEntity<Payment> createPayment(@RequestParam String paymentMethod){
		 Payment response = null;
		 
		 if(paymentMethod.equals("creditCardPayment"))
			 response = creditCardPayment.createPayment();
		 if(paymentMethod.equals("rupayCardPayment"))
			 response = rupayCardPayment.createPayment();
		 if(paymentMethod.equals("upiPayment"))
			 response = upiPayment.createPayment();
		 if(paymentMethod.equals("internetBankingPayment"))
			 response = internetBankingPayment.createPayment();
		 
		 return ResponseEntity.ok(response);
		
	}
	
}
