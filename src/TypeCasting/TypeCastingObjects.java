package TypeCasting;

class Animal{
	
}

class Dog extends Animal{
	
}
class Cat extends Animal{
	
}


public class TypeCastingObjects {

	public static void main(String[] args) {
		
		//it will throw runtime error
		/*Animal an=new Dog();
		Cat ct=(Cat)an;*/
		
		//it will not throw runrtime error  as it is satisfying all rules
		/*Animal an=new Dog();
		Dog dg=(Dog)an;*/
		
		
		//It will throw run time error
		/*Animal an=new Animal();
		Dog dg=(Dog)an;*/
		
		// it will not throw error as it is upcasting which is implicit
		Dog dg=new Dog();
		Animal an=dg;
	}
}
