package springBoot.springBoot.scope.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping(path = "/order")
public class CreateOrderHandler {

	@Autowired
	Order busTicketorder;

	@Autowired
	Order flightTicketorder;

	public CreateOrderHandler() {
		System.err.println("Eager and Singleton : CreateOrderHandler initialized");
	}

	@PostMapping(path = "/create")
	public ResponseEntity<Order> createOrder(@RequestHeader String orderType) {
		Order response = null;
		if (orderType.equals("BUS"))
			response = busTicketorder.createOrder();
		else
			response = flightTicketorder.createOrder();
		return ResponseEntity.ok(response);
	}

	@PostConstruct
	public void init() {
		System.err.println("CreateOrderhandler hashCode is : " + this.hashCode() + "busTicketOrder hsahCode is : "
				+ busTicketorder.hashCode() + "flightTicketOrder hashCode is : " + flightTicketorder.hashCode());
	}
}
