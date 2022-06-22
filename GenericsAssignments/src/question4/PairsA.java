package question4;

public class PairsA {
   public static void main(String[] args) {
	pair<String,String> obj=new pair<String,String>("1","Haii");
	System.out.println(obj.getObj1()+"="+obj.getobj2());
	
}
}
class pair<K,V>{
	private K obj1;
	private V obj2;
	public pair(K obj1, V obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	public K getObj1() {
		return obj1;
	}
	public V getobj2() {
		return obj2;
	}
}
