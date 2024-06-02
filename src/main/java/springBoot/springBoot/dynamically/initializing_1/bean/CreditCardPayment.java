package springBoot.springBoot.dynamically.initializing_1.bean;

import org.springframework.stereotype.Component;

@Component(value = "CreditCardPayment")
public class CreditCardPayment implements Payment{

	private String orderType = "CreditCardPayment";
	private int orderId = 0;
	
	public CreditCardPayment() {
		System.err.println("Eager : CreditCardPayment initialized");
	}
	
	@Override
	public Payment createPayment() {
		System.err.println("CreditCardPayment created : "+this.hashCode() +" orderId : "+this.getOrderId());
		return this;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

}
