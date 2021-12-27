package exceptionStudy;

public class Test {
	public void sayNick(String nick)  throws FoolException{
			if ("fool".equals(nick)){
				throw new FoolException();
			}
			System.out.println("당신의 별명은 " + nick + " 입니다.");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test = new Test();
		try {
			test.sayNick("fool");
			test.sayNick("genious");
		
		}catch(FoolException e) {
			System.out.println("에러가 발생했습니다.");
		}
	}

}
