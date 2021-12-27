package functionExam;
class Circle implements Cloneable{
	Pointt p;//원점
	double r;//반지름
	
	Circle(Pointt p, double r){
		this.p=p;
		this.r=r;
	}
	public Circle shallowCopy() { //얕은 복사
		Object obj=null;
		try {
			obj=super.clone();
		}catch(CloneNotSupportedException e) {}
		return (Circle)obj;
	}
	public Circle deepCopy() {
		Object obj=null;
		try {
			obj=super.clone();
		}catch(CloneNotSupportedException e) {}
		Circle c=(Circle)obj;
		c.p=new Pointt(this.p.x,this.p.y);
		return c;
	}
	public String toString() {
		return "[p="+p+", r= "+r+"]";
	}
	
}

class Pointt{
	int x,y;
	Pointt(int x, int y){
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "("+x+","+y+")";
	}
}
public class ShallowDeepCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle(new Pointt(1,1),2.0);
		Circle c2=c1.shallowCopy();
		Circle c3=c1.deepCopy();
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);
		
		c1.p.x=9;
		c1.p.y=9;
		System.out.println("====c1 변경 후====");
		System.out.println("c1="+c1);
		System.out.println("c2="+c2);
		System.out.println("c3="+c3);
		
		/*shallowCopy()의 내용을 보면 단순히 원본 객체가 가지고 있는 값만 그대로 복사한다.
		 * 
		 * deepCopy()는  shallowCopy에 두줄 추가하여 
		 * Circle c=(Circle)obj;
			c.p=new Pointt(this.p.x,this.p.y);
			복제된 객체가 새로운 Point객체를 참조하도록 한다. 
			즉 원본이 참조하고 잇는 객체까지 복사한 것이다.
		 * */
	}

}
