package CashInBank;

public class Driver {
public static void main(String[] args) {
	Bank c=new Current();
	Bank s=new Savings();
	 
	int a=c.totCash();
	int b=s.totCash();
	System.out.println(a);
	System.out.println(b);
	System.out.println("total cash "+(a+b));
}
}
