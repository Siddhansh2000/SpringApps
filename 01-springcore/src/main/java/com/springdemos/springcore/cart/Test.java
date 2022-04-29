package com.springdemos.springcore.cart;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		// create the spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springdemos/springcore/cart/config.xml");

		// get the hospital bean from the container
		ShoppingCart shoppingCart = (ShoppingCart) context.getBean("shoppingCart");

		// print the bean
		System.out.println(shoppingCart);


	}

}
