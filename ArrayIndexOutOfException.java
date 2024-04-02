package assignment13;

public class ArrayIndexOutOfException {
public static void main(String[] args) {
	int []a=new int  [3];
	a[0]=12;
	a[1]=23;
	a[2]=55;
	try {
		System.out.println(a[3]);
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Invalid index. Array size is exceeded.");
	}
}
}
