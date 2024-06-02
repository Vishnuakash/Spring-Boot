package springBoot.springBoot.dynamically.initializing_2.bean.copy;

public class RupayCardPayment implements Payment{

	private String orderType = "RupayCardPayment";
	private int orderId = 0;
	
	public RupayCardPayment() {
		System.err.println("Eager : RupayCardPayment initialized");
	}
	
	@Override
	public Payment createPayment() {
		System.err.println("RupayCardPayment created : "+this.hashCode() +" orderId : "+this.getOrderId());
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