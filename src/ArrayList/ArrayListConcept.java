package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListConcept {
	
	public static void main(String[] args) {
		
		//declaration of hetergenous ArrayList
		//ArrayList list=new ArrayList();
		

		//declaration of hetergenous ArrayList using parent reference variable(List)
		//List li=new ArrayList();
		
		
		//declaration of arrayList for a homogenous(integer) type of data, as int type data we are using here hence Wrappers class Integer used.
		//ArrayList<Integer> li=new ArrayList<>();
		
		ArrayList li=new ArrayList();
		//adding values to ArrayList
		li.add(3);
		li.add("welcome");
		li.add(null);
		li.add(3);
		
		System.out.println(li.size());
		System.out.println(li);
		
		//removing element from Arraylist
		li.remove(1);
		//System.out.println(li);
		
		//modifying value
		li.set(2,"Hi");
		//System.out.println(li);
		
		//inserting element
		li.add(2,45);
		//System.out.println(li);
		
		//accessing value from ArrayList
		//System.out.println(li.get(1));
		
		
		//retriving data using for each loop
		/*for(Object x:li) {
			System.out.println(x);
		}*/
		
		
		
		//retriving data using iterator concept
		/*Iterator it=li.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
		
		//checking if arrayList is empty or not
		System.out.println(li.isEmpty());
		
		//removing all elements from arrayList
		//li.clear();
		//System.out.println(li);
		
		
		//removing specific multiple elemetns from arrayList
		ArrayList li2=new ArrayList();
		li2.add("welcome");
		li2.add(3);
		
		li.removeAll(li2);
		System.out.println(li);
		
		
		
		
		
	}

}
