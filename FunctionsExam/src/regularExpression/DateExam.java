package regularExpression;

import java.util.*;//구버전
import java.time.*;//신버전
import java.time.format.DateTimeFormatter;

public class DateExam {

	public static void main(String[] args) {
		/* Calendar 추상 클래스이기 대문에 객체를 생성할 수 없고 메서드를 통해서만 사용한다.
		 * Calendar cal=new Calendar(); //에러
		 * Calendar cal=Calendar.getInstance();
		 * */
		Calendar today=Calendar.getInstance();
		System.out.println("올해의 연도는 : "+today.get(Calendar.YEAR));
		System.out.println("현재 월은 : "+today.get(Calendar.MONTH));
		//MONTH는 0에서 시작한다.
		System.out.println("올해 몇번째 주 : "+today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이달 중 몇번째 주 : "+today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이달의 며칠 : "+today.get(Calendar.DATE));
		System.out.println("이달의 며칠 : "+today.get(Calendar.DAY_OF_MONTH));
		System.out.println("올해의 며칠: "+today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일 : "+today.get(Calendar.DAY_OF_WEEK));
		//일요일이 1
		int day=today.get(Calendar.DAY_OF_WEEK);
		String dayy="";
		switch(day) {
		case 1: dayy="일요일";break;
		case 2: dayy="월요일";break;
		case 3: dayy="화요일";break;
		case 4: dayy="수요일";break;
		case 5: dayy="목요일";break;
		case 6: dayy="금요일";break;
		case 7: dayy="토요일";break;
		}
		System.out.println("오늘은 "+dayy+"입니다.");
		//배열에 넣어서 뽑아내기도 좋음
		
		Calendar date1=Calendar.getInstance();
		Calendar date2=Calendar.getInstance();
		
		
		date1.set(2021,11,28);
		//System.out.println("date1은"+toString(date1));
		
		long diff= (date2.getTimeInMillis()-date1.getTimeInMillis())/1000;
		System.out.println("date1부터 date2까지"+diff+"초 지났습니다.");
		long daydif=(date2.getTimeInMillis()-date1.getTimeInMillis())/(1000*60*60*24);
		System.out.println("date1부터 date2까지"+daydif+"일 지났습니다.");
		
		LocalDate now=LocalDate.now();
		System.out.println(now);//현재날짜 (컴퓨터)
		
		LocalDate pari=LocalDate.now(ZoneId.of("Europe/Paris"));
		System.out.println(pari);
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yy/MM/dd");
		String formatedNow=now.format(formatter);
		System.out.println(formatedNow);
		
		int year=now.getYear();
		System.out.println("현재 연도는 "+year+"입니다.");
		
		String month=now.getMonth().toString();
		System.out.println("현재의 월은 "+month.toLowerCase()+"입니다.");
		
		int monVal=now.getMonthValue();
		System.out.println("현재의 월은 "+monVal+"입니다.");
		
		String dofw=now.getDayOfWeek().toString();
		System.out.println("오늘은 "+dofw+"입니다.");
		
		int dofwVal=now.getDayOfWeek().getValue();
		System.out.println("오늘은 "+dofwVal+"입니다."); //월요일1 일요일 7
		
		LocalTime ntime=LocalTime.now();
		System.out.println(ntime);
		
		
		int hour=ntime.getHour();
		int minute=ntime.getMinute();
		int second=ntime.getSecond();
		
		LocalDateTime curr=LocalDateTime.now();
		
		System.out.println(curr);
		
		DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		System.out.println(curr.format(format));
		
		int y=curr.getYear();
		System.out.println(y+"년");
		int m=curr.getMonthValue();
		System.out.println(m+"월");
		int d=curr.getDayOfMonth();
		System.out.println(d+"일");
		int h=curr.getHour();
		System.out.println(h+"시");
		int tm=curr.getMinute();
		System.out.println(tm+"분");
		int s=curr.getSecond();
		System.out.println(s+"초");
		int wday=curr.getDayOfWeek().getValue();
		String[] arr= {"","월","화","수","목","금","토","일"};
		System.out.println(arr[wday]+"요일");
		
		
	}



}
