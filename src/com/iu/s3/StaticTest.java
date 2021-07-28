package com.iu.s3;

public class StaticTest {

	public static int num =10;
	public int num1 = 20;
	
	
	
	
	
	public static void staticMethod() {
		System.out.println("Static Method");
		
	}
	
	
	
	
	public void instanceMethod() {
		System.out.println("Instance Method");
		System.out.println(StaticTest.num);
		System.out.println(this.num);
		//this() - 생성자호출
		//참조변수명.메서드명()
		StaticTest.staticMethod();
		
	}
	
	
	
}




