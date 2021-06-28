public class sample{
	public static void main(String args[]){
		int arr[]={5,1,4,2,8,7,28,-3};
		boolean isSwapped;
		int size=arr.length;
		for(int i=0;i<size;i++){
			//no.of iteration
			isSwapped=false;
			System.out.println(i);
			for( int j=0;j<size-i-1;j++){
				if(arr[j]>arr[j+1]){
					//swap
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					isSwapped=true;
				}
			}
			if(!isSwapped){
				break;
			}
		}
		for(int num:arr){
			System.out.print(num+" ");
		}
	}
}