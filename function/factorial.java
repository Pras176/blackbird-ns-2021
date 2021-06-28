public class factorial{
	int fact(int num){
		int result;
		if(num==1|| num==0){
			return 1;
		}
		else{
		result=fact(num-1)*num;
		return result;
	}

	}
	public static void main(String args[]){
		/*System.out.println("In main faumction");
		main(new String[]{});
		String a[]=new String[5]; //print infnite time int main(); */
		factorial factorial=new factorial();
		int factorial1=factorial.fact(5);
		System.out.println(factorial1);


	}
}
/* fact(1)
  return 1;

  fact(2)
  return= 1*2;

  fact(3)
  return=2*3=6

  fact(4)
  return=6*4=24
  
  fact(5)
  return=24*5=120;
  */