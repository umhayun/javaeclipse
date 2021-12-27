package javaStudy;


public class Car extends Machine{
	public void turnOn() {
		System.out.println("turnOn");
	}
	public void turnOff() {
		System.out.println("turnOFF");
	}
	
	
	
	
	
	
//	protected String name;
//	protected int number;
	
//	public void run() {
//		System.out.println("RUN!!!!");
//		
//	}
//	public static void main(String[] args) {
//		Car car=new Car("포니",1234);
//		System.out.println("name : "+car.name);
//		System.out.println("number : "+car.number);
//////		bus.ppangppang();
////		//부모클래스로 만든 인스턴스 car는 부모 즉 자신의 자원은 쓸 수 있지만
////		//자식 즉 bus의 매서드는 사용할 수 없다.
////		
	//}
//	
////	String name;
//	int number;
//	public Car(String n, int num) {
//		this.name=n;
//		this.number=num;
//		
//	}
	//생성자는 클래스명과 동일해야 하면 리턴타입과 리턴이 없다.
	//void도 없다.
	//생성자를 한개라도 만들지 않으면 자동으로 기본생성자를 생성하지만 하나라도 만들기만 하면 기본 생성자는 만들지 않는다.
}
