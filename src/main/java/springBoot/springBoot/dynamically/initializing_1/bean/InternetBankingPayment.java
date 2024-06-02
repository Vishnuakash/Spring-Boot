package springBoot.springBoot.dynamically.initializing_1.bean;

import org.springframework.stereotype.Component;

@Component(value = "InternetBankingPayment")
public class InternetBankingPayment implements Payment{

	private String orderType = "InternetBankingPayment";
	private int orderId = 0;
	
	public InternetBankingPayment() {
		System.err.println("Eager : InternetBankingPayment initialized");
	}
	
	@Override
	public Payment createPayment() {
		System.err.println("InternetBankingPayment created : "+this.hashCode() +" orderId : "+this.getOrderId());
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
