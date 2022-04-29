package com.sid.firsttry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

    	Car obj = (Car)context.getBean("car");
    	obj.drive();
    	
//    	Vehicle obj = (Vehicle)context.getBean("bike");
//    	obj.drive();
    	
//    	Tyre t = (Tyre) context.getBean("tyre");
//    	System.out.println(t);
    }
}
