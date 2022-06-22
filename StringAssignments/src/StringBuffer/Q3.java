package StringBuffer;

public class Q3 {
public static void main(String[] args) {
	StringBuffer str=new StringBuffer("This method returns the reversed object on which it was called");
	System.out.println(str);
	str.reverse();
	System.out.println("reversed String :"+str);
}
}
