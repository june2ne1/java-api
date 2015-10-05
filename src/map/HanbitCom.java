package map;

import java.util.Scanner;

public class HanbitCom {
	/**
	 * "안녕하세요 ".substring(1,3); 0이상 2미만
	 * "녕하"
	 */
	/**
	 * CRUD 
	 * Create : 추가
	 * Read : 검색
	 * Update : 수정
	 * Delete : 삭제
	 */


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MemberService service = new MemberServiceImpl(); {
			Member m = new Member();
			
		
	
		while (true) {
		System.out.println("1 :회원가입 2 :로그인  3 : 총회원수 4: ID검색 5 : 비번 수정 6 :회원탈퇴 7: 종료 ");
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
			service.join(id,  pass,  name,  age,  addr);
			System.out.println("반갑습니다."+name+"님");
		    
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
		case 3:System.out.println(service.count()+"명 입니다.");
			break;
		case 4:System.out.println("검색할 ID입력");
			m = service.searchById(scanner.next());
					if (m != null) {
						System.out.println(m.toString());
					} else {
						System.out.println("검색할 ID가 존재하지 않습니다.");
					}
			
			break;
		case 5: System.out.println("ID :");
			id = scanner.next();
			System.out.println("Pass");
			pass = scanner.next();
			System.out.println(service.changePass(id,pass));
			break;
		case 6:
			System.out.println("삭제할 ID입력");
			System.out.println(service.remove(scanner.next()));
			break;
		case 7:
			System.out.println("========종료=======");
			break;
		default:
			break;
		}
		}
		}
	}
}
		
	


