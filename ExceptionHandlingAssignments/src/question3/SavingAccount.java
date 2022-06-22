package question3;

public class SavingAccount {
public long id;
public double balance;

 public SavingAccount(long id, double balance) {
	super();
	this.id = id;
	this.balance = balance;
}
public double withdraw(double amount) throws Exception {
	 if(balance<amount) {
		throw new Exception();
	 }
	 else if(amount<0) {
		 throw new Exception();
	 }
	 return amount;
 }
 public double deposit(double amount) {
	balance+=amount;
	return balance;
 }
}
