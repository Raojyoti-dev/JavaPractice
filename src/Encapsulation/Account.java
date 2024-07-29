package Encapsulation;

public class Account {
	
//in Encapsulation variables should be private as it 
//should be accessed through methods only not dirctly through objects
	
	private int accountno;
	private String name;
	private double amount;
	
	//getter and setter methods
	
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
