package PassingParamsToMainMethod;

public class MainMethod {

	public static void main(String[] args) {
		
		System.out.println(args.length);
		
		for(String value:args) {
			System.out.println(value);
		}

	}

}
