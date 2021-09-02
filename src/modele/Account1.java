package modele;

public class Account1 {
	protected double balance;  
	public Account1(double x1){
		this.balance=x1;}
	public Account1 (Account1 x1){}
	public void withdraw (int x1){ 
		this.balance=this.balance - x1;		
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
