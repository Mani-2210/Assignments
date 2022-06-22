package assignments;

public class ExchangePosi {
public static void main(String[] args) {
	int [] arr= {56,89,45,65,32,15,65,79};
	int a=3;
	int b=5;
	NonGenric obj=new NonGenric();
	obj.swapElements(arr, a, b);
	obj.print(arr);
}
}
class NonGenric {
	public <T> void swapElements(int arr[],int i,int j) {
		int temp=0;
		temp =arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public void print(int arr[]) {
		for(int i:arr) {
			System.out.println(i);
		}
	}
}
