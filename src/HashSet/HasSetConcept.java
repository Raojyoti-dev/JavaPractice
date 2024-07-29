package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HasSetConcept {

	public static void main(String[] args) {
		
		//declaring using same class object
		HashSet hs=new HashSet();
		//declaring using parent interface reference obj
		//Set hasset=new HashSet();

		//if hasset contains specific datatype
		//HashSet<Integer>hs=new HashSet<Integer>();
		
		hs.add(null);
		hs.add(100);
		hs.add("welcome"); 
		hs.add(null);
		hs.add(3);
		hs.add(100);
		
		System.out.println(hs);
		
		//removing element from hasset
		
		hs.remove("welcome");
		//hashset after removing the element
		System.out.println(hs);
		
		//insertion is not possible in hashset as index is not there
		//accessing specific element is also not possible as indexing is not there
		
		//retirving a element from hashset converting the hashset into arraylis
		/*ArrayList arr=new ArrayList(hs);
		System.out.println(arr.get(2));
		System.out.println(arr.get(0));*/
		
		
		//retriving elements using for each loop
		/*for(Object x:hs) {
			System.out.println(x);
		}*/
		
		//retriving elements using iterator method
		/*Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		//removing all element sfrom hasset
		hs.clear();
		System.out.println(hs.isEmpty());
		
		
	}

}
