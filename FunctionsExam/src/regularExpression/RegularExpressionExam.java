package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionExam {

	public static void main(String[] args) {
		/*Regular Expression 정규식, 정규 표현식
		 * 정규 표현식은 텍스트 중에서 원하는 조건과 일치하는 문자열을 찾아내기 위해 사용한다.
		 * 원래 Unix에서 사용하는 것이었는데 현재는 다양한 대부분 언어에서 지원하고 있다.
		 * 
		 * 많은 양의 텍스트 데이터에서 원하는 데이터를 쉽게 뽑아낼 수 있고 데이터가 어떤 형식에 맞는지 체크할 수 있다.
		 * 예를 들면 html에서 전화번호나 이메일 주소만 추출하거나 
		 * 입력한 비밀번호가 숫자와 영문자의 조합으로 되어있는지 등을 쉽게 간단하게 확인할 수 있다.
		 * 
		 * */
		//문자열 배열에 담긴 문자열들 중에서 지정한 정규식과 일치하는 문자열을 찾아서 출력
				//Pattern은 정규식을 정의하고 Matcher비교하는 역할을 한다.
				//1. 정규식을 매개변수로 Pattern 클래스의 static 메서드인 
				//	 pattern.compile()호출하여 Pattern객체를 얻는다.
				//2. 정규식으로 비교할 대상을 매개변수로 pattern 클래스의 Matcher를 호출하여 객체를 얻는다.
				//3. Matcher객체에 matches()호출하여 정규식에 부합하는지 확인한다.
		String[] data= {"bat", "body", "bonus", "cA","ca","co","c.", "c0",
						"car", "combat","count","date","dict"};
		//Pattern p=Pattern.compile("c[a-z]*");//c로 시작하는 소문자 영단어 
		//Pattern p=Pattern.compile("c[a-z]"); //c로 시작하는 두자리 소문자 영단어
		//Pattern p=Pattern.compile("c[a-zA-Z]");//c로 시작하는 두자리 대소문자 영단어
		//Pattern p=Pattern.compile("c[a-zA-Z0-9]");//c로 시작하는 두자리 대소문자 숫자까지 영단어
		//Pattern p=Pattern.compile(".*");//모든 문자열
		//Pattern p=Pattern.compile("c.");//c로 시작하는 두자리 문자열
		//Pattern p=Pattern.compile("c.*"); //c로 시작하는 전체 문자
		//Pattern p=Pattern.compile("c\\.");//c로시작하고 문자.
		//Pattern p=Pattern.compile("c[0-9]");//c로 시작하고 숫자1개
		//Pattern p=Pattern.compile("c\\d");//c로 시작하고 숫자 1개
		//Pattern p=Pattern.compile("c.*t");//c로 시작하고 t로끝나는 모든 문자열
		
		//Pattern p=Pattern.compile("[b|c].*");//c와 b로 시작하는 모든 문자열.
		//Pattern p=Pattern.compile("[bc].*");//c와 b로 시작하는 모든 문자열.
		//Pattern p=Pattern.compile("[b-c].*");//c와 b로 시작하는 모든 문자열.
		//Pattern p=Pattern.compile("[^b|c].*");//c와 b로 시작하지 않는 모든 문자열.
		//Pattern p=Pattern.compile("[^bc].*");//c와 b로 시작하지 않는 모든 문자열.
		//Pattern p=Pattern.compile("[^b-c].*");//c와 b로 시작하지 않는 모든 문자열.
		
		//Pattern p=Pattern.compile(".a.*");//a를 포함하는 모든 문자
		//Pattern p=Pattern.compile(".*a.+");//a를 포함하는 모든 문자열(+)반드시 1개 이상의 글자
		//Pattern p=Pattern.compile("[b|c].{2}");//c와 b로 시작하는 모든 세자리 문자열.
		
		//Pattern p=Pattern.compile("0\\d{1,2}");//0으로 시작하는 최소2자리 최대 3자리 숫자
		//Pattern p=Pattern.compile("\\d{3,4}");//최소 3자리 최대 4자리의 숫자.
		//Pattern p=Pattern.compile("\\d{4}");
		Pattern p=Pattern.compile("(0\\d{3})-(\\d{3,4})-(\\d{4})");//전화번호 찾기
		//정규식의 일부를 괄호로 나누어 묶어서 그룹화할 수 있다.
		
		for (String d:data) {
			Matcher m=p.matcher(d);
			if(m.matches())
				System.out.print(d+",");
			
		}
	}

}
