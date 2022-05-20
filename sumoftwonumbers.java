
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int sum;
	    Scanner sc= new Scanner(System.in); 
	    System.out.println("Enter the first number:\n");
	    int a=sc.nextInt();
	    System.out.println("Enter second number:\n");
	    int b=sc.nextInt();
	    sum=a+b;
		System.out.println("Sum of the numbers=\t"+sum);
	}
}
