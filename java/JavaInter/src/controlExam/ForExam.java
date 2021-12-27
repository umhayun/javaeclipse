package controlExam;

import java.util.Scanner;

public class ForExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 초기값, 조건식, 증감식 전부 생략 가능.
		 * \t - printf에서 탭
		 * for(;;) - 무한반복 */
//		for(int i=1;i<=5;i++) {
//		System.out.println(i);
//		}
//		for(int j=1;j<=5;j++) {
//			System.out.print(j);
//		}
//		int sum=0;
//		for(int i=1;i<=10;i++) {
//			sum+=i;
//			System.out.println("1부터 "+i+"까지의 합 : "+sum);
//		}
//		for(int i=1,j=10;i<=10;i++,j--) {
//			System.out.println(i+"      "+j);
//		}
//		
//		for(int j=2;j<=9;j++) {
//		for(int i=1;i<=9;i++) {
//			
//			System.out.printf("%d * %d = %d\t",j,i,j*i);
//		}
//		System.out.println("");
//		
//		}
		Scanner sc=new Scanner(System.in);
//		int star=sc.nextInt();
//		for(int i=1;i<=star;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
			
//		int star=sc.nextInt();
//		for(int i=1;i<=star;i++) {
//			for(int j=star;j>=i;j--) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		//- 향상된 for 구문 : for each	
		//★ for (타입 변수명 : 배열 또는 컬렉션) {}

		int[] arr= {1,2,3,4,5};
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
//
		int sum=0;
		int count=0;
		for(int i:arr) {
			System.out.println(i);
			sum+=i;
			count+=1;
		}
		System.out.println("합계 : "+sum);
		System.out.println("원소 개수 : "+count);		
	}

}
