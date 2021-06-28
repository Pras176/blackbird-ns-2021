import java.util.Scanner;

public class sample{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int i;
		float f;
		System.out.println("Enter i value:");
		i = sc.nextInt();
		System.out.println("Enter f value:");
		f = sc.nextFloat();
		float sum=i+f;
		float diff=i-f;
		float mul=i*f;
		float div=i/f;
		System.out.println("sum value:" +sum);
		System.out.println("diff value:" +sum);
		System.out.println("mul value:" +sum);
		System.out.println("div value:" +sum);

	}
}