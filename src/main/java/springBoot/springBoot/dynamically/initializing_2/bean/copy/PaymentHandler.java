package springBoot.springBoot.dynamically.initializing_2.bean.copy;

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
	Payment payment;

	@PostMapping(path = "/processPayment")
	public ResponseEntity<Payment> createPayment(@RequestParam String paymentMethod) {
		Payment response = payment.createPayment();

		return ResponseEntity.ok(response);
	}

}
