import java.util.Scanner;    //calculator program

public class sample{
	public static void main(String arges[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter second number");
		int num2 = sc.nextInt();

	
		System.out.println("Enter choice");
		System.out.println("1. Add '+'");
		System.out.println("2. sub '-'");
		System.out.println("3. mul '*'");
		System.out.println("4. div'/'");
	/*	int choice = sc.nextInt();
		int result=2;

		switch(choice){
			case 1:
			result= num1+num2;
			System.out.println("Result:" +result);
			break;

			case 2:
			result= num1-num2;
			System.out.println("Result:" +result);
			break;

			case 3:
			result= num1*num2;
			System.out.println("Result:" +result);
			break;

			case 4:
			result= num1/num2;
			System.out.println("Result:" +result);
			break;

			default :
			System.out.println("wronginput");
		}
		*/
		char choice = sc.next().charAt(0);
		int result = 0;
		switch(choice){
			case '+':
			result= num1+num2;
			System.out.println("Result:" +result);

			 switch(1){
			 	case 1: System.out.println("1");
			 	break;
			 	default: System.out.println("default");
			 }
			break;

			case '-':
			result= num1-num2;
			System.out.println("Result:" +result);
			break;

			case '*':
			result= num1*num2;
			System.out.println("Result:" +result);
			break;

			case '/':
			result= num1/num2;
			System.out.println("Result:" +result);
			break;

			default :
			System.out.println("wronginput");

		}




	}
}