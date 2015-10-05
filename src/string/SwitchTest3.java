package string;

import java.util.Scanner;

/**
 * @file_name : SwitchTest3.java
 * @author    : june2ne1@naver.com
 * @date      : 2015. 9. 18.
 * @story     :
 */
public class SwitchTest3 {
	
	public static void main(String[] args) {
		// char opcode = '+';
		// String opcode = "+";
		Scanner scanner = new Scanner(System.in); 
		System.out.println("숫자를 입력하세요");  
		int num = scanner.nextInt();             
		System.out.println("연산자를 입력하세요");
		String opcode  = scanner.next();
		System.out.println("숫자를 입력하세요");
		int num2 = scanner.nextInt();
		
		
		int result = 0;
		int  remainder = 0;
		
		
		System.out.println(num+opcode+num2+" = "+result+" ["+ remainder+"] ");
		
		
	}






}
