package string;

import java.util.StringTokenizer;

/**
 * @file_name : StringTokenizer.java
 * @author    : june2ne1@naver.com
 * @date      : 2015. 10. 6.
 * @story     : StringTokenizer
 */
public class StringTokenizerMain {
	/**
	 *StringTokenizer 은 생성자에서 String 으로 잘라내는 기능을 함
	 * @param args
	 */
	public static void main(String[] args) {
		String date = "2015-10-06";
		StringTokenizer tok = new StringTokenizer(date, "-");
		System.out.println("토큰의 갯수"+tok.countTokens());
		System.out.println("-을 제외한 출력문");
		while (tok.hasMoreTokens()) { 
			//elements 는 배열의 요소를 뜻하며 char 요소가 있을때까지 ->끝까지
			String token = tok.nextToken();
			System.out.print(token+"\t");
			
		}
 	}

}
/**
 *  - 넣어주세요, 빼주세요
 *  010-2222-3333
 *  01022223333
*/









