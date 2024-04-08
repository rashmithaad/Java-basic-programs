import java.util.Scanner;
public class Palindrome {

	//Check the given number is palindrome or not using while loop
	public static void main(String[] args) {
	
//		int number = 121;
//		int reverse = 0;
//		int remainder ;
//		int temp = number;
//		while(number!=0) 
//		{
//			
//			remainder = number % 10;
//			reverse = reverse*10 + remainder;
//			number = number/10;
//			
//		}
//		
//		System.out.println("Reverse of a number is: " + reverse);
//		
//		if(temp==reverse) {
//			System.out.println("Palindrome!");
//		}else {
//			System.out.println("Not a Palindrome!");
//		}
		
	
		//Integer Palindrome using while loop 
		
//				int number = 1234;
//				int reverse = 0;
//				int remainder ;
//				int temp = number;
//				
//				while(number!=0) 
//				{
//					
//					remainder = number % 10;
//					reverse = reverse*10 + remainder;
//					number = number/10;
//					
//				}
//				
//				System.out.println("Reverse of a number is: " + reverse);
//				if( temp == reverse) {
//					System.err.println("Palindrome");
//				}else {
//					System.out.println("Not a Palindrome");
//				}
		
		
				
		//Check the given String is a Palindrome or not using a for loop
		
//		String str;
//		String strrev = "";
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the name : ");
//		str = sc.next();
//		
//	
//		System.out.println("Reverse of a string is : ");
//		
//		for(int i=str.length()-1 ; i>=0; i--)
//		{
//			strrev = strrev + str.charAt(i);
//			
//		}
//		
//		if(strrev.equals(str)) {
//			System.out.println("Palindrome!!");
//		}else {
//			System.out.println("Not a Palindrome!!");
//		}
		
		
		// Reverse of a string using while loop
		
//		String str; 
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the name : ");
//		str = sc.next();
//		String strrev = "";
//		int i=str.length()-1;
//		
//		while(i>=0) {
//			strrev= strrev+str.charAt(i);
//			i--;
//		}
//		if(strrev.equalsIgnoreCase(str)) {
//			System.out.println("Palindrome!!");
//		}else {
//			System.out.println("Not a Palindrome!!");
//		}

	//Reverse of a string using do while loop
		String str;
		String strrev ="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : ");
		str = sc.next();
		
		int i=str.length()-1;
		do{
			
			strrev= strrev + str.charAt(i);
			i--;
		}
		while(i>=0);
		
		if(strrev.equalsIgnoreCase(str)) {
			System.out.println("Palindrome!");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

}
