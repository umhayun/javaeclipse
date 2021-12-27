package javaStudy;

public class VariableExam {
	//global variable
	//전역변수- 변수의 선언 위치가 클래스 블록 안이기 때문에 변수의 사용범위는 클래스 전체가 된다.
	static int globalScope=10;
	static int staticVal=15;
	public void scopeTest(int value) {
		int localScope=20;
		
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}

	public static void main(String[] args) {
		//local variable
		//지역변수 - 메서드 안에서 선언
		System.out.println(globalScope);
//		System.out.println(localScope);
//		System.out.println(value);
		System.out.println(staticVal);
		//static 변수는 static을 선언하지 않은 메서드 내에서는 사용을 해도 문제가 되지 않는다.
	}

}
