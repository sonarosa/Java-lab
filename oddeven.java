
import java.util.Scanner;
public class oddeven
{
	public static void main(String[] args) {
	    int sum;
	    Scanner sc= new Scanner(System.in); 
	    System.out.println("Enter the a number:\t");
	    int a=sc.nextInt();
	    if(a%2==0)
	    {
		System.out.println("Number "+a+" is even");
	    }
	    else{
	      	System.out.println("Number "+a+" is odd");  
	    }
	}
}
