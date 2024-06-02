package springBoot.springBoot.dynamically.initializing_1.bean;

import org.springframework.stereotype.Component;

@Component(value = "UPIPayment")
public class UPIPayment implements Payment{

	private String orderType = "UPIPayment";
	private int orderId = 0;
	
	public UPIPayment() {
		System.err.println("Eager : UPIPayment initialized");
	}
	
	@Override
	public Payment createPayment() {
		System.err.println("UPIPayment created : "+this.hashCode() +" orderId : "+this.getOrderId());
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
