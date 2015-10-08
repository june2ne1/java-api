package enums;

import java.util.HashMap;
import java.util.Map;

public class ToySpec {
	private Map<String,Object>map;
	public ToySpec() { //ToySpec의 생서자를 사용해야만 존재함
		map = new HashMap<String,Object>();
	}
	public Map<String, Object> getMap() {
		return map;
	}
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	public void setMap(String key, Object val) { //오버로딩 
		map.put(key, val);	
 }
	//키값에 따라서 속성 가져오기
	public Object getMap(String key){
		return map.get(key);
	}
// 스펙 비교 검색
	public boolean match(ToySpec spec) {
		 boolean boo = false;
		 String dest = "",target=""; //dest는 비교대상 target은 비교당하는 객체
		 if (spec.getMap("ToyUser") != null) {
			 dest += spec.getMap("ToyUser");
			 target +=this.getMap("ToyUser");
			 
			
		}
		 return spec.equals(target);
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return map.toString();
	}
}