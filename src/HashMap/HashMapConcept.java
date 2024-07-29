package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	public static void main(String[] args) {
		
		//declaring using same ref child variable
		//HashMap hm=new HashMap();
		
		//declaring using parent interface variable
		//Map hm=new HashMap();
		
		
		//for hpmogenous data
		HashMap<Integer,String> hm=new HashMap<>();
		
		hm.put(100, "Jyoti");
		hm.put(101,"Shiva");
		hm.put(102,"Prakash");
		hm.put(103,"Harsh");
		hm.put(100,"Arusi");
		
		System.out.println(hm);
		
		//removing a elemetn from hashmap
		hm.remove(100);
		System.out.println(hm);
		
		//accessing a element
		System.out.println(hm.get(101));
		
		
		//accessing all key values
		System.out.println(hm.keySet());
		
		//accessing all values
		System.out.println(hm.values());
		
		//accessing all key value paris
		System.out.println(hm.entrySet());
		
		//reading data from hashmap
		for(int x:hm.keySet()) {
			
			System.out.println(x+" "+hm.get(x));
		}
		
	}

}
