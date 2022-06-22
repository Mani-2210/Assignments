package assignments;

import java.util.Scanner;

public class Q1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first number");
	int num1=sc.nextInt();
	System.out.println("Enter the second number");
	int num2=sc.nextInt();
	try {
		System.out.println(num1/num2);
	}
	catch(ArithmeticException e) {
		System.out.println("Exception due to divisible by zero");
	}
}
}
