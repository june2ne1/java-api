package string;

import java.util.Collections;
import java.util.Scanner;

public class SwitchCaloMain {
	public static void main(String[] args) {
		// char opcode = '+';
		// String opcode = "+";
		Scanner scanner = new Scanner(System.in); 
		System.out.println("숫자 2개를 입력하세요");  
		//StaticCalc calc = new StaticCalc();
		//타입     인스턴스 뉴  생성자
	//	calc.plus(scanner.nextInt(),scanner.nextInt()); 인스턴스방식으로 접근해서 경고메시지가 발생
		System.out.println(StaticCalc.plus(scanner.nextInt(), scanner.nextInt()));
	
		
		
		
	}
	}

class StaticCalc{
	static int result = 0; //멤버변수 중에서 클래스 변수
	public static int plus (int a, int b){ //매개변수 = 파라미터 = 매변
	 return  a + b;
	
}
	public static int minus (int a, int b){ //매개변수 = 파라미터 = 매변
		 return  a - b;
}
	public static int multi (int a, int b){ //매개변수 = 파라미터 = 매변
		 return  a * b;
}
	public static int divide(int a, int b){ //매개변수 = 파라미터 = 매변
		 return  a / b;
	}
}




//스태틱 영역에 저장됨
//프로그램이 종료되야 종료됨..










