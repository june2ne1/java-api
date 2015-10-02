package grade;

import java.util.Scanner;

public class HanbitSchool {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeService service = new GradeServiceImpl();
		while (true) {
			System.out.println("1 :성적등록 2:학적부리스트보기 3:학번으로검색 4:이름으로검색 5:1등부터출력 6:이름순출력 7:종료");
			
			switch (scanner.nextInt()) {
			case 1:
				System.out.println("학번 등록");
				String hak = scanner.next();
				System.out.println("이름 입력");
				String name = scanner.next();
				System.out.println("국어 점수");
				int kor = scanner.nextInt();
				System.out.println("영어 점수");
				int eng = scanner.nextInt();
				System.out.println("수학 점수");
				int math = scanner.nextInt();
				System.out.println(service.input(hak, name, kor,eng, math));
				break;
			case 2:
				System.out.println(service.getList());
				break;
			case 3:
				System.out.println("학번 :");
				hak = scanner.next();
				System.out.println(service.searchByHak(hak));
				break;
			case 4:
				System.out.println("이름 :");
				name = scanner.next();
				System.out.println(service.searchByName(name));
				break;
			case 5:
				System.out.println(service.descGradeByTotal());
				break;
			case 6:
				System.out.println(service.ascGradeByName());
				break;
			case 7:
				System.out.println("==============종료=========");
				
				break;
			default:break;
			}
		}
	}

}
