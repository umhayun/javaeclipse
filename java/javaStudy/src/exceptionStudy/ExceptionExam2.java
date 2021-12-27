package exceptionStudy;

public class ExceptionExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		int j=0;
		int k=divide(i,j);
		System.out.println(k);
		System.out.println("종료");
		
	}
	public static int divide(int i, int j) {
		try {
		int k=i/j;
		return k;
		} catch(Exception e){
			System.out.println("에러가 발생했습니다!!"+e.toString());
			return 0;
		}
		
	}
}
