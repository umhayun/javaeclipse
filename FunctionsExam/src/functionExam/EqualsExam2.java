package functionExam;
class Person{
	long id;
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			return id==((Person)obj).id;
			//obj가 Object 타입이므로 id값을 참조하기 위해서는 Person타입으로 변환 필요
		}
		else {
			return false; 
		}
	}
	Person(long id){
		this.id=id;
	}
}
public class EqualsExam2 {
	public static void main(String[] args) {
		Person p1=new Person(1231232323232L);
		Person p2=new Person(1231232323232L);
		
		if(p1==p2) { // 주소값 비교
			System.out.println("p1과 p2는 같은 사람입니다.");
		}
		else {
			System.out.println("p1과 p2는 다른 사람입니다.");
		}
		if(p1.equals(p2))
			System.out.println("p1과 p2는 같은 사람입니다.");
		else
			System.out.println("p1과 p2는 다른 사람입니다.");
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		String str1=new String("abc");
		String str2=new String("abc");
		String str3="abc";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		//Str
	}
}
