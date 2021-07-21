package com.iu.s2.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		Member member = new Member();
		
		member.setAge(30);
		member.setKi(50);
		
		
		int ki = member.getKi();
		System.out.println(ki);
		
		
		
		int age = member.getAge();
		System.out.println(age);
		
		member.info();
		

	}

}
