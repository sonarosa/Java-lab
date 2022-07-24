import java.util.*;
public class Thirdlargest {

	public static void Thirdlargest(int[] array,int arr_size) {
		int temp;
		for(int i=0;i<arr_size;i++) {
			for(int j=i+1;j<arr_size;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}
			}
		}
		System.out.println("Third largest number in the array "+array[3]);
	}

	public static void main(String[] args) {
		System.out.println("Enter size of the array :\n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter array elements:");
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		Thirdlargest(a,n);
		

	}

}
