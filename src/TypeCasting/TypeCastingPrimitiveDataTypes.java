package TypeCasting;

public class TypeCastingPrimitiveDataTypes {

	public static void main(String[] args) {
		
		//upcasting which is automatic
		int val=10;
		long longVal=val;
		System.out.println(longVal);
		
		//downcasting which we need to specify explicitely
		
		double doubleval=10.5;
		int convertedVal=(int)doubleval;
		System.out.println(convertedVal);
		
		
		
	}

}
