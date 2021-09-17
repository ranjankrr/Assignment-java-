package first;
import java.util.Scanner;

public class Typecasting {
	public static void main(String args[]) {
		Scanner rishu = new Scanner(System.in);
		System.out.println("Enter user integer value");
		int a= rishu.nextInt();
		System.out.println("the number of float value =" +(float)a);
		System.out.println("the number of double value =" +(double)a);
		System.out.println("the number of short value =" +(short)a);
		
		//convert into float type and another type
		
		System.out.println("Enter user float value");
		float b= rishu.nextFloat();
		System.out.println("the number of integer value =" +(int)b);
		System.out.println("the number of double value =" +(double)b);
		System.out.println("the number of short value =" +(short)b);
		
		
		
		
	}
	

}
