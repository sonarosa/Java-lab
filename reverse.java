import java.util.Scanner;
public class reverse
{
	public static void main(String[] args) {
	   int rev=0,rem;
	    Scanner sc= new Scanner(System.in); 
	    System.out.println("Enter the  number:\n");
	    int n=sc.nextInt();
	    while(n!=0)
           {rem=n%10;
            rev=rev*10+rem;
            n=n/10;

	   }	
         System.out.println("Reverse of the number=\t"+rev);
	}
}
