import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		
//		int a,b;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the value of a : ");
//		a = sc.nextInt();
//		System.out.println("Enter the value of b : ");
//		b = sc.nextInt();
//		
//		int temp;
//		System.out.println("The vale of a & b before swapping : " + a +" ," + b);
//		
//		temp=a;
//		a=b;
//		b=temp;	
//		System.out.println("The value of a & b after swapping : " + a + " ," + b);

		int x,y ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		x = sc.nextInt();
		System.out.println("Enter the value of b : ");
		y= sc.nextInt();
		
		System.out.println("The values of a & b before Swapping : " + x +" , "+ y);
		
		x= x+y;
		y= x-y;
		x= x-y;
		
		System.out.println("The values of a & b after swapping : " + x + " , "+ y);
		
	
	}

}
