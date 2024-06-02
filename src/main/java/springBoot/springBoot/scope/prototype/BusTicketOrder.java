package springBoot.springBoot.scope.prototype;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@Scope(value = "prototype")
public class BusTicketOrder implements Order{

	private int orderId = 0;
	private String orderType = "BUS";
	
	public BusTicketOrder() {
	    System.err.println("Lazy : BusTicketOrder innitialized");
	}
	
	@Override
	public Order createOrder() {
		System.err.println("BusTicktOrder created : " + this.hashCode() + " with orderId : " + this.getOrderId());
		return this;
	}
	
	@PostConstruct
	public void init() {
		System.err.println("BusTicketOrder hashCode is : "+this.hashCode());
	}
	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}


}
