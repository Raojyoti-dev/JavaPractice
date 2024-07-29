package Encapsulation;

public class AccountMainClass {

	public static void main(String[] args) {
		
		Account ac=new Account();
		ac.setAccountno(101);
		ac.setName("Jyoti");
		ac.setAmount(5000);
		double amount=ac.getAmount();
		System.out.println(amount);
		String name=ac.getName();
		System.out.println(name);
		int acc=ac.getAccountno();
		System.out.println(acc);

	}

}
