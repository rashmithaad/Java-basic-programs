import java.util.Scanner;

public class Fibonacci {

//Program to write the fibonacci series using for loop
	public static void main(String[] args) {
		
		int firstterm , secondterm, nextterm;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the firstterm ");
		firstterm = sc.nextInt();
		System.out.println("Enter the secondterm ");
		secondterm = sc.nextInt();
		
		System.out.println("The fibonacci series are: ");
		for(int i=0; i<10; i++) {
			
			nextterm = firstterm + secondterm;
			firstterm = secondterm;
			secondterm = nextterm;
			
			System.out.println(secondterm);
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}


