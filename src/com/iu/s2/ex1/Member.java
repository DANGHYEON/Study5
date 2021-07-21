package com.iu.s2.ex1;

public class Member {
	
	private String id;
	private int age;
	private int muge;
	private int ki;
	
	
	
	public void setKi(int ki) {
		this.ki=ki;
	}
	
	public int getKi() {
		return this.ki;
	}
	
	
	//데이터를 입력하는 메서드는 set멤버변수명 
	public void setAge(int age) {
		if(age>0 && age<150) {
		this.age=age;
		}else {
			this.age=20;
		}
	}
	
	//데이터를 외부로 내보낼때 get멤버변수명
	public int getAge() {
		return this.age;
	}
	
	
	public void info() {
		System.out.println("Id : "+id);
		System.out.println("Age : "+age);
		System.out.println("Muge : "+muge);
		System.out.println("ki : "+ki);
		
	}
	
	

}
