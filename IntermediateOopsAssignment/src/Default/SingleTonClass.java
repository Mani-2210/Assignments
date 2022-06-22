package Default;

public class SingleTonClass {
private SingleTonClass() {
	System.out.println("single ton constructor");
}
}
//Due to the declaration of private constructor in base it cannot be inherited
//class Driver extends SingleTonClass{
//	public static void main(String[] args) {
//		
//	}
//}
