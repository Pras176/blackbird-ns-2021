public class TowerofHanoi{
	static void towerofHanoi(int n, char from, char to, char aux)
	{
		if(n==1)
		{
			System.out.println("move disk 1 freerod"+from+"to rod"+to);
			return;
		}
		else{
		towerofHanoi(n-1,from,to,aux);
			System.out.println("move disk"+n+"from rod"+from+"to rod"+to);
			towerofHanoi(n-1,aux,to,from);
	}

	}
	public static void main(String args[]){
		int n=1;
		towerofHanoi(n,'A','C','B');

	}
}