package map;

import java.util.Scanner;

public class HanbitCom {
	/**
	 * "안녕하세요 ".substring(1,3); 0이상 2미만
	 * "녕하"
	 */


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MemberService service = new MemberServiceImpl(); {
			
		
	
		while (true) {
		System.out.println("1 :회원가입 2 :로그인  3 : 총회원수 4: ID검색  5: 종료 ");
		switch (scanner.nextInt()) {
		case 1:
			System.out.println("ID입력하세요");
			String id = scanner.next();
			System.out.println("PW입력하세요");
			String pass = scanner.next();
			System.out.println("이름입력하세요");
			String name = scanner.next();
			System.out.println("나이입력하세요");
			String age = scanner.next();
			System.out.println("주소입력하세요");
			String addr = scanner.next();
		    
			break;
		case 2:
			System.out.println("ID, 비번을 입력 하세요");
			String result = service.login(scanner.next(), scanner.next());
			String flag = result.substring(0, 2); //일치하면 "환영"
			switch (flag) {
			case "환영": System.out.println(result);
			//현실에서는 로그인 성공 페이지 전환
			break;
			case "비번": System.out.println(result);
			//현실에서는 로그인 페이지 다시 보여줌
				break;
			case "입력": System.out.println(result);
			//현실에서는 회원가입 페이지 보여줌
			break;

			default:
				break;
			}
			
			break;
		case 3:
			break;
		case 4:break;
		case 5:break;
		
			
			

		default:
			break;
		}
		}
		}
	}
}
		
	


