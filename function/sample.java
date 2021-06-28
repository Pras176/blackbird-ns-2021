public class sample{
	/*int num1;
	int num2;
	static int sum;
	static void display(){
		System.out.println("displaythe values");
	}
	void sum(){
		System.out.println("Adds the value");
	}

	public static void main(String args[]){
		sample sample1= new sample();
		sample sample2= new sample();
		sample1.sum=100;
		sample2.sum=200;
		sample1.num1=10;
		sample1.num2=20;
		sum=300;
		System.out.println(sum);
		display();*/


    int num1;
	int num2;
	static int sum;
	static void display(int sum){
		System.out.println("displaythe values"+sum);
	}
	void sum(int x, int y){
		int sum=num1+num2;
		display(sum);

	}
	int multiply(int  x, int y){
		int product=x*y;
		return product;
	}

	public static void main(String args[]){
		sample sample1= new sample();
		sample sample2= new sample();
		sample1.num1=10;
		sample1.num2=20;
		sample2.num1=30;
		sample2.num2=40;
		sample1.sum(sample1.num1, sample1.num2);
		sample2 .sum(sample2.num1, sample2.num2);
		/*int multiply=sample1.multiply(sample1.num1, sample1.num2);
		System.out.println(multiply);*/
		System.out.println(sample1.multiply(sample1.num1, sample1.num2));
	

}
}