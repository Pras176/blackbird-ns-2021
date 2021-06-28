import java.io.BufferedReader;
import java.io.InputStreamReader;


public class sample{
	public static void main(String args[]){
		System.out.println("Enter the number");
		InputStreamReader inputStreamReader= new InputStreamReader(System.in);
		BufferedReader bufferedReader= new BufferedReader(inputStreamReader);
		int n=Integer.parseInt(bufferedReader.readLine());
		float n=Float.parseFloat(bufferedReader.readLine());
		System.out.println("Number is" +n);
	}

}