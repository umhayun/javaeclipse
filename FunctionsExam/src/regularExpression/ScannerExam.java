package regularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScannerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner는 문자 데이터를 입력받는 목적으로 JDK1.5부터 추가되었다.
		 * 다양한 형태의 입력을 받아 처리할 수 있다.
		 * 정규표현식과 함께 쓸 수 있다.
		 * 
		 * */
		//1. hello		123
		
		Scanner sc=new Scanner(System.in);
		String[] a=null;
		String finish="";
		Pattern p=Pattern.compile("\\d{4}");
		//Matcher m=p.matcher(a);
		while(true) {
			System.out.print("문자열입력 : ");
			String input=sc.nextLine();
			a=input.split(" +");//입력 받은 내용을 공백으로 자른다. (+는 공백의 갯수 무관 표시)
			if(input.equals("q")) {
				break;
			}
			else {
				for(int i=0;i<a.length;i++) {
					System.out.println(a[i].toLowerCase());
				}
			}
		}
		
	}

}
