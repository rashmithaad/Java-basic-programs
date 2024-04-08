import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
//		int noofdays;
//		System.out.println("Enter no. of days : ");
//		Scanner sc = new Scanner(System.in);
//		noofdays = sc.nextInt();
		
//		switch(noofdays){
//		
//		case 28 :
//			System.out.println("This is feb");
//			break;
//		case 31 :
//			System.out.println("This is oct");
//			break;
//		case 30:
//			System.out.println("This is nov");
//			break;
//		default:
//			System.out.println("There is no month");
//			break;
//			
//		}
		
		
//      Performing Arithmatic Operation by using switch
		
		int a ;
		int b ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a :");
		a=sc.nextInt();
		
		System.out.println("Enter the value of b :");
		b=sc.nextInt();
		
		System.out.println("Enter the operation :");
	    String operation = sc.next();
		
		
		switch(operation) {
		
		case "+" : 
			System.out.println("Add of a & b :" + (a+b));
			break;
		case "-":
			System.out.println("Sub of a & b :" + (a-b));
			break;
		case "*":
			System.out.println("Mul of a & b :" + (a*b));
			break;
		case "%":
			System.out.println("Mod of a & b :" + (a%b));
			break;
		case "/" :
			System.out.println("Div of a & b :" + (a/b));
			break;
		default:
			System.out.println("There is no operation");
			break;
		
		}

	}

}
