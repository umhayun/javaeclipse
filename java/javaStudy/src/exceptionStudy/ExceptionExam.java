package exceptionStudy;

public class ExceptionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i=10;
//		int j=0;
//		//에러 예상위치 바로위 작성
//		try {
//		int k=i/j;
//		System.out.println(k);
//		}catch(ArithmeticException e){
//			System.out.println("예외가 발생했습니다.\n"+e.toString());
//		}finally {
//			System.out.println("에러 발생 여부와 상관없이 항상 실행");
//		}
//		System.out.println("main end!!");
		try {
		int[] array=new int[10];
		array[20]=5;
		System.out.println(array[20]);
		}
		catch(Exception e) {
			System.out.println("배열의 범위를 지나쳤어요\n"+e.toString());
		}
		System.out.println("성공");
		
	}

}
