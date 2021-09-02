package modele;

public class Account2 extends Account1 {
	protected double InterestRate;
	public Account2(double x1,double x2){
		super(x1);
		this.InterestRate = x2;
		} 
	public void withdraw (int x1){
		super.withdraw (x1);
		if (x1>this.balance)
			this.balance=this.balance - (this.InterestRate)*x1;
	    this.InterestRate=this.InterestRate/2;
	    
	}
	public double getInterestRate() {
		return InterestRate;
	}
	public void setInterestRate(double interestRate) {
		InterestRate = interestRate;
	} 
}
