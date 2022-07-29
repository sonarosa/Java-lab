import java.util.Scanner;
public class alternateprime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		System.out.println("The alternate prime numbers within "+num+" are :");
		int iter = 2;
        for(int i = 2; i<=num;i++)
        {
            if(isPrimecheck(i))
            {
                //Only prints the alternate prime numbers
                if(iter%2==0)
                    System.out.print(i+" ");
                iter++;
            }
		}
       
	}
	static boolean isPrimecheck(int num)
    {
        int iter = 2;
        boolean flag = true;
        while (num > iter)
        {
            if (num % iter == 0)
            {
                flag = false;
                break;
            }
            iter++;
        }
        return flag;
    }
}


