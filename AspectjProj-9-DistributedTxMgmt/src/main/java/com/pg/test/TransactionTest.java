package com.pg.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TransactionTest {

	public static void main(String[] args) {
		System.out.println("TransactionTest.main()");
		ApplicationContext ctx=null;
		ctx=new FileSystemXmlApplicationContext("src/com/pg/configure/Persistence-bean.xml");
	}

}
