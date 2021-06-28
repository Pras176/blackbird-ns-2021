import java.util.Scanner;

public class sample1{
	static int partition(int arr[], int low,int high)
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter pivot index:");
		int pivotIndex=scanner.nextInt();
		int pivot=arr[pivotIndex];

		if(pivotIndex!=high){
			int temp=arr[high];
			arr[high]=arr[pivotIndex];
			arr[pivotIndex]=temp;

		}

		pivot=arr[high];

		int i=low-1;
		for(int j=low;j<=high;j++){
			if(arr[j]<pivot){
				i++;

				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;

			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;

		return i+1;
	}
	static void quicksort(int arr[],int low,int high){
		if(low<high){
			int pi=partition(arr,low,high);
		quicksort(arr,low,pi-1);
		quicksort(arr,pi+1,high);
		}
	}
	public static void main(String args[]){
		int arr[]={10,80,30,90,40,50,70,-10};
		int n=arr.length;
		quicksort(arr,0,n-1);
		System.out.println("Srted array:");
		for(int num:arr){
			System.out.println(num+" ");
		}
	}
}