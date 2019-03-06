package com.pg.array;

interface A{
	public String wish(String name);
}

/*class AImpl implements a{
	@Override
	public String wish() {
		String msg="GoodMorning Preetam";
		return msg;
	}
}*/

public class LamdaExpression {

	public static void main(String[] args) {
		/*A a=new A(){
			public String wish() {
				String msg="GoodMorning Preetam";
				return msg;
			}
		};
		System.out.println(a.wish());*/

		A a=(n)-> 
			{
			String msg="GoodMorning "+n;
			return msg;
			};
		System.out.println(a.wish("Preetam Gagan"));
	}
}


