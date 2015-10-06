package calendar;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @file_name : SimpleDateFormatMain.java
 * @author    : june2ne1@naver.com
 * @date      : 2015. 10. 6.
 * @story     : SimpleDateFormatMain
 */
public class SimpleDateFormatMain {
	public static void main(String[] args) {
		Date today = new Date(); //컨트롤 시프트 O
		SimpleDateFormat sdf1,sdf2,sdf3,sdf4,sdf5,sdf6;
	     sdf1 = new SimpleDateFormat();//15. 10. 6 오후 3:59
		 sdf2 = new SimpleDateFormat("yyyy-MM-dd"); //2015-10-06
		 sdf3 = new SimpleDateFormat("yyyy년 MM월 dd일 E요일"); //2015년 10월 06일 화요일
		 sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//2015-10-06 16:04:55
		 sdf5 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
	     sdf6 = new SimpleDateFormat("yyyy");
		
		
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		System.out.println(sdf5.format(today));
		System.out.println(sdf6.format(today));
		
	}

}
