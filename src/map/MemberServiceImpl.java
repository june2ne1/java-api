package map;

import java.util.HashMap;
import java.util.Map;


public class MemberServiceImpl implements MemberService {
	Map<String,Object> map = new HashMap<String,Object>();
	Member member = new Member();
	
	
	@Override
	public void join(String id, String pass, String name,String age, String addr) {
		// ???
		member.setId(id);
		member.setPass(pass);
		member.setName(name);
		member.setAge(age);
		member.setAddr(addr);
		map.put(id, member);
		
		
		
	}

	@Override
	public String login(String id, String pass) {
		System.out.println(id+"입장");
		System.out.println(pass+"비번");
				
		String result = "";
		
		
		/**
		 * 환영합니다. 홍길동 서울에 사시는 30세 홍길동님.
		 * 비번이 다릅니다. 다시 입력하세요
		 * 입력하신 아이디는 존재하지 않거나, 일치하지 않습니다. 다시 입력해 주세요.
		 * Map에서 밸류값만 가져오는 메소드는 map.get("키값")
		 */
		if (map.containsKey(id)) {
			Member temp = new Member();
			temp = (Member) map.get(id);// 왜? 맵에서 밸류가 오브젝트이기 때문
			;
			if (temp.getPass().equals(pass)) {
				result = " 환영합니다. "+temp.getAddr() +"에 사시는 "+temp.getAge()+"세"+ temp.getName()+"님.";
			} else {
				result = "비번이 다릅니다. 다시 입력하세요";
				
			}
		}  else {
			result = "입력하신 ID는 존재하지 않거나, 일치하지 않습니다. 다시 입력해주세요";

		} {

		}
		return result;
	}

	@Override
	public int count() {
		
		return map.size();
	}

	@Override
	public Member searchById(String id) {
		/*
		Member temp = (Member)map.get(id);
		Member result = null;
		if (id.equals(temp.getId())) {
			result = temp;
			
		}
		return result;
		*/
		return (Member)map.get(id);
	}

	

	@Override
	public String changePass(String id,String pass) {
		String result = "";
		Member taget =  (Member)map.get(id);
		if (taget != null) {
			taget.setPass(pass);
			result = "비밀번호가 변경되었습니다.";
			
		} else {
			result = "비밀번호가 변경되지 않았습니다.";

		}
		return result;
	}


	@Override
	public String remove(String id) {
		String result = null;
		Object m = map.remove(id);
		if (m != null) {
			
			result = "입력하신 ID"+id+"가 삭제되었습니다";
			
		} else {
			result ="삭제하려는 ID가 없습니다. 다시 입력하세요";

		}
		return result;
	}
	

	

}
