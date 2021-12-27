package com.eightcruz.study;

public class DuckExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck duck=new Duck();
		duck.sing(); //Duck
		duck.fly();  //Bird
		
		Bird b=new Bird();
		// 추상 클래스는 부모 클래스로는 사용할 수 있지만 
		// 객체를 생성할 수는 없다.
		// 추상 클래스는 abstract 키워드를 클래스 앞에 사용한다.
		// 추상 클래스는 추상 매서드(인터페이스/명령서 처럼)를 포함할 수 있다.
		// 추상 매서드도 abstract 키워드를 붙인다.
		// 추상 매서드는 객체 생성이 불가능하다.
		
	}

}
