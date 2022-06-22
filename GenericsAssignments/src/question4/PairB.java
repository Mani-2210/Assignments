package question4;

import java.util.Date;

public class PairB {
public static void main(String[] args) {
	Date d=new Date();
	pairs<String,java.util.Date> obj=new pairs<String,java.util.Date>("1",d);
	System.out.println(obj.getObj1()+"="+obj.getObj2());
}
}
class pairs<K,V>{
	private K obj1;
	private V obj2;
	public pairs(K obj1, V obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	public K getObj1() {
		return obj1;
	}
	public V getObj2() {
		return obj2;
	}
}