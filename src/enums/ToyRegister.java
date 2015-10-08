package enums;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class ToyRegister {
	private Vector<Toy> toys;
	private Toy toy;
	public ToyRegister(){
		this(10,5);
	}
	public ToyRegister(int capa, int increment){
		// capa 리스트의 현재 적재용량, increment 적재량이 넘어서면 증가되는 값
		//String[] str = new String[100];
		toys = new Vector<Toy>(capa,increment);
		
	}
	public void register(String name,int price,ToySpec spec){
		Toy toy = new Toy(name, price, spec);
		toys.add(toy);
	}
	public Vector<Toy> searchName(String name){
		Vector<Toy> temp = new Vector<Toy>();
		for (int i = 0; i < toys.size(); i++) {
			while (toy instanceof Toy) {
				if (toys.get(i).equals(name))  { // condition 은 채우시오
					//조건에 맞는 답을 채우시오
 					
				}
				
			}
			
		}
		 return temp;
	}
	public List<Toy> searchType(ToySpec searchSpec){
		List<Toy> temp = new ArrayList<Toy>();
		Enumeration<Toy> e = toys.elements();
		while (e.hasMoreElements()) {
			Toy toy = (Toy) e.nextElement();
			ToySpec spec = toy.getSpec();
			if (spec.equals(searchSpec)) {
				temp.add(toy);
				
			}
			
		}
		return temp;
	}



/**
 * 모든 등록된 장난감 출력
 */

 public List<Toy> getAll(){
	return toys;
  }
 }



