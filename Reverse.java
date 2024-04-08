import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
  // reversing an integer using for loop
		int number = 121;
		int reverse = 0;
		int remainder;
		
		for( ; number!=0; number=number/10)
		{
			remainder =number % 10;
			reverse= reverse * 10 + remainder;
			
		}
		
		System.out.println("Reverse of a number is: " + reverse);
		
	
		//Reversing a string using for loop
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : ");
		String str = sc.next();
	
		System.out.println("Reverse of a string is : ");
		for(int i=str.length(); i>0; i--)
		{
			System.out.print( str.charAt(i-1));
		}
			 
		
	}

}
