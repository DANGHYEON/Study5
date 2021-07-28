package com.iu.s4;

public final class Test {  //클래스 앞에도 가능
	
	 int num=10;
	 final int num2;
	 
	 public Test() {
		 //생성자에서 넣는건 가능!
		 num2=10;
		 
	 }
	 
	 public Test(int num2) {
		 this.num2=num2;
		 
	 }
	
	 
	 public final void test() {
		 int n =0;
		 final int n2 = 10;
		 
		 
	 }
	 
	

}
