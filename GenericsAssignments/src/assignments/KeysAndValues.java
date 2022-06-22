package assignments;

import java.util.HashMap;
import java.util.Random;

public class KeysAndValues {
public static void main(String[] args) {
	HashMap<Integer,Double> hm=new HashMap<Integer, Double>();
	//to store random elements we are using random class
	Random r=new Random();
	int max=45;
	double range=7.23;
	double min=5;
	for(int i=0;i<10;i++) {
		int x=(int)(r.nextInt(max));
		double y=range+r.nextDouble()-min;
		hm.put(x, y);
		System.out.println(x+" "+y);
	}
	System.out.println(" ");
	System.out.println(hm);
}
}
