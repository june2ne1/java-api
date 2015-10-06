package calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 
 * @file_name : CalendarMain.java
 * @author    : june2ne1@naver.com
 * @date      : 2015. 10. 6.
 * @story     : Calendar 클래스
 *  */
public class CalendarMain {
	/*
	 * 특정일 (2015-9-14)로 부터 오늘까지 일수 구하기
	 * 2016.02.05에서 오늘날짜까지 남은 일수 구하기 (D-18)
	 */
	public static void main(String[] args) {
		Calendar startDay = Calendar.getInstance();//스태틱 메소드
		Calendar today = Calendar.getInstance();
		int year = 0, month =0;
		String date = "";
		StringTokenizer tok = new StringTokenizer(date,"-");
		Scanner scanner = new Scanner(System.in);
		
		
		/*startDay.set(2015,8,14);//실제값보다 월이 1 작다
		startDay.getTimeInMillis(); // 특정일에 해당하는 int 값을 가져올(1970.01.01부터 누적된 초단위)
		int workDays = (int) Math.ceil((today.getTimeInMillis()- startDay.getTimeInMillis())/(24*60*60*1000));
		System.out.println(workDays+"일");
		*/
		System.out.println("특정일 입력");
		
	}
	
		
		
		
		
		
		
		
class DayCount{
	public int day;
	Calendar startDay = Calendar.getInstance();
	Calendar today = Calendar.getInstance();
	int year = 0, month =0, date = 0;
	
	
	}

}







