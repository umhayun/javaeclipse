package controlExam;

import java.util.Random;
import java.util.Scanner;

public class ifExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 제어문 Control Statement - IF,Switch
		 * 코드의 제일 위부터 아래로 한 문장씩 순차적으로 진행되는 프로그램의 흐름을 조절하여 
		 * 일부분은 건너뛰기도 하고 다시 위에서부터 내려올수 있게 제어한다.
		 * if(score > 60){
		 * System.out.println("합격입니다.");
		 * }
		 * 
		 * 
		 * depar=="영업부"|| depar=="기획부" 영업부와 기획부만 조건
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
//		int score=80;
//		if(score>60) { 
//			System.out.println("합격입니다.");
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		char s=a%10>=8?'+':a%10<=4?'-';
//		String grade="";
//		if(a>=90) {
//			grade="A";
//		}
//		else if(a>=80){
//			grade="B";
//		}
//		else if(a>=70) {
//			grade="C";
//		}
//		else if(a>60) {
//			grade="D";
//		}
//		else {
//			System.println("F");
//		}
//		System.out.println(grade+s);
		
		/*switch 구문
		 * if문의 경우 항목이 많아질수록 복잡해지고 코드 가독성이 많이 떨어지게 된다.
		 * 평균적인 처리시간도 항목이 늘어날수록 길어지게 된다.
		 * 이러한 if문과는 달리 switch는 보다 간결하고 알아보기 쉽다.
		 * 보통 처리해야하는 경우의 수가 아주 많을 경우에 switch
		 * switch로 만든 모든 구문은 if로 구현할 수 있지만 if로 만든 모든구문을
		 * switch로 구현할 수는 없다.
		 * 
		 * 1. 조건식을 계산
		 * 2. 조건식을 만족하는 case문으로 이동한다.
		 * 3. 해당 case문의 구문들을 실행한다.
		 * 4. break를 만나기 전까지는 모든 구문을 전부 실행한다.
		 * *. switch 구문의 조건식의 결과는 정수 또는 문자열이다.
		 * */
		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		String season="";
//		switch(a){
//		case 3: case 4: case 5:season="봄";break;
//		case 6: case 7: case 8: season="여름";break;
//		case 9: case 10: case 11:season="가을";break;
//		case 12: case 1: case 2: season="겨울";break;
//		}
//		System.out.println(a+"월의 계절은 "+season+" 입니다.");
		
		
		//#가위(1)바위(2)보(3)
//		System.out.print("가위(1)바위(2)보(3) 중 하나를 입력하세요");
//		int me=sc.nextInt();
//		Random ran2=new Random();
//		int com=1+ran2.nextInt(3);
//		System.out.println("당신은"+me+"이고 컴퓨터는 "+com+"입니다.");
//		int result= me-com;
//
//		switch(result){
//		case 2: case -1: System.out.println("졌습니다.");break;
//			
//		case 1: case -2: System.out.println("이겼습니다.");break;
//			
//		case 0: System.out.println("비겼습니다.");break;
//		}
		System.out.println("주민등록번호를 입력하세요");
		String id=sc.next();
		
		char i=id.charAt(7);
		
		
		switch(i)
		{
		case '1': case '3': System.out.println("남자");break;
		case '2': case '4': System.out.println("여자");break;
		}
		
		
		

	}

}
