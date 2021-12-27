package controlExam;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * While 반복문은 for에 비해서 구조가 간단하다.
		 * 조건식이 참일 동안 반복수행한다.
		 * 
		 * While (조건식){
		 * 
		 * }
		 * 
		 * 조건식에 true를 넣어 무한반복 수행
		 * for(::) = while(true)
		 * 무한반복 설정시에는 반드시 종료 조건을 만들어야 한다.
		 * 
		 * */
		
//		for(초기화;조건식;증감식)
//		초기화
//		while(조건식) {
//			수행문장
//			증감식
//		}
		/*조건식 생략 불가*/
//		int count=10;
//		
//		System.out.println("카운트 다운 시작");
//		while(count>=1) {
//			System.out.println(count);
//			count--;
//			long j=999_999_999L;
//			while(j>=0) {
//				j--;
//			}
//		}
//		System.out.println("Awesome!!");
		
		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int sum=0;
//		while(a!=0) {
//			sum+=a%10;
//			a/=10;
//			
//		}
//		System.out.println(sum);
		
		int a=sc.nextInt();
		int i=1;
		int sum=0;
		while(i<=a) {
			sum+=i;
			System.out.println(i+" - "+sum);
			i++;
		}
		
	}

}
