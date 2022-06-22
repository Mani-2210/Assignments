package question3;

public class DriverClass {
public static void main(String[] args) {
	SavingAccount s=new SavingAccount(1L,2000);
	
	try {
		System.out.println(s.withdraw(-2500));
	}
	catch(Exception e) {
		System.out.println("InsufficentBalanceException");
	}
	
}
}
