import java.util.Scanner;

public class While {

	public static void main(String[] args) {
	// Reversing an int using while loop
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		int reverse = 0;
		int remainder ;
		
		while(number!=0) 
		{
			
			remainder = number % 10;
			reverse = reverse*10 + remainder;
			number = number/10;
			
		}
		
		System.out.println("Reverse of a number is: " + reverse);
	
	//Reverse of a string using while loop
	
//	String str; 
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the name : ");
//	str = sc.next();
//	
//	int i=str.length();
//	System.out.println("Reverse of a string is : ");
//	while(i>0) {
//		
//		System.out.print( str.charAt(i-1));
//		i--;
//	}
	
   }
}
