package string;
/**
 * @file_name : StringMethod.java
 * @author    : june2ne1@naver.com
 * @date      : 2015. 10. 5.
 * @story     : java.lang.String
 */
public class StringMethod {
	public static void main(String[] args) {
		System.out.println("abcde".contains("f")? "f가 존재" : "f가 존재하지 않음");
		String str1 = "abc";
		String str2 = "abc";
		/**
		 *  str1 과 str2가 같음, str1과 str2가 다름
		 */
		String result1 = ""; //삼항연산자 (str1 == str2)
		String result2 = "" ;//삼항연산자 (str1.equals (str2))
		System.out.println((str1 == str2) ? "str1과 str2가 같음" :"str1과 str2가 다름");
		System.out.println((str1.equals (str2)) ? "str1과 str2가 같음" :"str1과 str2가 다름");
		/**
		 * == : 주소값 비교, 주소까지 같은 완전 동일객체
		 * equals(): 실제값(value) 비교, 주소는 상관없고 이름만 동일 체크
		 * 
		 */
		
		//"Hello.txt"는 리터럴 객체이다
	System.out.println("Hello.txt".endsWith("txt") ? "텍스트 파일 입니다" : "텍스트파일이 아닙니다.");
		System.out.println("헬로우".concat(",자바월드 !!"));	//헬로우,자바월드 !!
		System.out.println("HELLO".equals("hello") ? "같습니다": "다릅니다");//다릅니다
		System.out.println("HELLO".equalsIgnoreCase("hello") ? "같습니다": "다릅니다");//같습니다
		System.out.println("Hello Tom".replace("Tom", "Alex"));//헬로우 알렉스
		/**
		 *  JDK 5 버전 이전에는 replace() replaceAll() 이 서로 다르게 반응했으니
		 *  이후에는 서로 같은 기능(전부 체인지되는 기능)으로 바뀌었음
		 *  그럼 차이점이 없는가? 하면 정규식에 대한 기능이 있는가 없는가의 차이점이 있다.
		 *   replace() 는 기능이 없고 replaceAll()은 기능이 있다.
		 *   따라서 replaceAll() 을 쓰도록 권고되고 있다
		 *  
		 */
		System.out.println("[1] A B C D : A B C D ".replace("C D", "E F"));
		System.out.println("[2] A B C D : A B C D ".replaceAll("C D", "E F"));
		/**
		 * .은 정규식에서 쓰이는데 맨 앞 한글자만 지정합니다.
		 * 그러니까 .a는 a앞 글자와 a까지를 뜻합니다.
		 * 아래 예제에서 replace()는.을 정규식 표현법으로 보질 않고 리터럴의 마침표로 인식함으로
		 * 프로그래밍에서 자주 사용하는 정규식을 적용할 수 없게 됩니다.
		 */
		
		System.out.println("[3] Hello Java ".replace("a", ""));// Hello Jv
		System.out.println("[4] Hello Java ".replaceAll(".a", ""));//Hello
		
	}

}
