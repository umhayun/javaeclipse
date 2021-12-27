package inter;

import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*삼항 연산자(조건)
		 * 첫번째 피연산자 조건식의 평가 결과에 따라 true면 두번째 항 false면 
		 * 세번재항의 값이 결과 된다.
		 * 여러번 중첩하면 가독성 떨어지므로 꼭 필요한 경우에만 사용*/
//		(조건식)? true: false
//		(조건식)?"A": (조건식)?"B": (조건식)? "C":"D"
		
		
		//삼항연산자를 사용하여 
		/*100~90: A
		 * 90~80: B
		 * 80~70: C
		 * 나머지 :D
		 * */
		
//		Scanner scan=new Scanner(System.in);
//		int a=scan.nextInt();
//		
//		System.out.println(a>=90?"A":a>=80?"B":a>=70?"C":"D");
		
		int x,y,z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		x=10;
		y=-5;
		z=0;
		absX=x>=0?x:-x;
		absY=y>=0?y:-y;
		absZ=z>=0?z:-z;
		signX=x>0?'+':x==0?'0':'-';
		signY=y>0?'+':y==0?'0':'-';
		signZ=z>0?'+':z==0?'0':'-';
		System.out.printf("x=%c%d%ny=%c%d%nz=%c%d%n", signX,absX,signY,absY,signZ,absZ);
		
	}

}
