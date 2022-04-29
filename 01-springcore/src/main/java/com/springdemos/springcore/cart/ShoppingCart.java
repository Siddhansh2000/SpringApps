package com.springdemos.springcore.cart;

public class ShoppingCart {

	String customerName;
	Items items;

	

	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public String toString() {
		return "ShoppingCart [items=" + items + ", customerName=" + customerName + "]";
	}
	
	

}
