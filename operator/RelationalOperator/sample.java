import java.util.Scanner;

public class sample{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int i,j;
		System.out.println("Enter i value:");
		i = sc.nextInt();
		System.out.println("Enter j value:");
		j = sc.nextInt();
		if(i>j){
		System.out.println("i is greater then j :");
	}
	else{
		System.out.println("j is greater than i");
	}
	
	}
}