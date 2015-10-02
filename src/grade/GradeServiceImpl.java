package grade;

import java.util.Collections;
import java.util.Collection;
import java.util.Comparator;
import java.util.ArrayList;



public class GradeServiceImpl implements GradeService {
	ArrayList<Grade> vec = new ArrayList<Grade>();
	AscName aSort = new AscName();
	DescTotal dSort = new DescTotal();
	
	/*
	 * 학생을 성적부에 등록하기 힌트 ) 벡터 메소드 중에 한 객체만 넣는 메소드를 사용하세요 = 연산자는 안됨.
	 * 한줄 코딩으로 끝 
	 *
	 */
	
	@Override
	public Grade input(String hak, String name, int kor, int eng, int math) {
		Grade grade = new Grade();
		grade.setHak(hak);
		grade.setName(name);
		grade.setKor(kor);
		grade.setEng(eng);
		grade.setMath(math);
		vec.add(grade);
		
		return grade;
	}
	
	/**
	 * 성적부에 등록된 전체 학생 리스트 출력
	 * 힌트) 필드에 있는 객체에 모든 학생 리스트가 있을 것이다.
	 * 필드 객체 값을 지역변수에 할당하자.
	 */

	@Override
	public ArrayList<Grade> getList() {
		
		return vec;
	}
	/**
	 * 학번으로 벡터를 뒤져서 일치하는 학번 한개만 리턴하기
	 */

	@Override
	public Grade searchByHak(String hak) {
		Grade grade = new Grade(); 
		for (int i = 0; i < vec.size(); i++) { //1000대신에 백터의 length를 구하는 메소드 찾아볼것
			if (vec.get(i).getHak().equals(hak)) {
				grade = vec.get(i);
				
				
			} 
		}
		return grade;
	}
	/**
	 * 이름으로 학적부에 등록된 학생 정보 전부 검색하기 (동명이인일 경우 전부 검색)
	 */

	@Override
	public ArrayList<Grade> searchByName(String name) {
		ArrayList<Grade> temp = new ArrayList<Grade>();
		for (int i = 0; i < vec.size(); i++) {
			if (vec.get(i).getName().equals(name)) {
				temp.add(vec.get(i));
				
				
			}
			
		}
		return temp;
	}

	@Override
	public ArrayList<Grade> descGradeByTotal() {
		Collections.sort(vec,dSort);
		return vec;
	
	}
	@Override
	public ArrayList<Grade> ascGradeByName() {
		Collections.sort(vec,aSort);
		return vec;
		
		
	}
	@Override
	public void input(Grade grade) {
		// TODO Auto-generated method stub
		
	}

}
