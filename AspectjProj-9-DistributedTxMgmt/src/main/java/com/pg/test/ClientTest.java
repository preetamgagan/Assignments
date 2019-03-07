package com.pg.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pg.service.AccountService;

public class ClientTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context=null;
		context=new ClassPathXmlApplicationContext("com/pg/configure/Persistence-bean.xml");
		AccountService service=context.getBean("service" ,AccountService.class);
		try {
			System.out.println("Money Transfered??::"+service.TransferMoney(1001, 1002, 5000));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
