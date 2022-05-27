import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int sum;
	    Scanner sc= new Scanner(System.in); 
	    System.out.print("Choose any of the following to calculate area\n");
	    System.out.print("1.Area of square\n");
	    System.out.print("2.Area of rectangle\n");
	    System.out.print("3.Area of circle\n");
	    System.out.print("Enter your choice:");
	    int choice=sc.nextInt();
	    switch(choice)
	    {
	   case 1:
	      
	       
	       System.out.print("-->Enter side of the square:");
	        int s=sc.nextInt();
	        computeArea(s);
	        break;
	   case 2:
	       System.out.print("-->Enter length of the rectangle:");
	       int l=sc.nextInt();
	       System.out.print("-->Enter breadth of the rectangle:");
	       int b=sc.nextInt();
	       computeArea(l,b);
	       break;
	   case 3:
	        System.out.print("-->Enter radius of the circle");
	        double r=sc.nextDouble();
	        computeArea(r);
	        break;
	   default:
	       System.out.println("Wrong option!!\n");
	    }
	
		
	}
public static void computeArea(int side)
{int areasq;
areasq=side*side;
System.out.println("Area of square of given side:"+areasq);
}
public static void computeArea(int l,int b)
{int arearect;
arearect=l*b;
System.out.println("Area of rectangle of given length and breadth:"+arearect);
}
public static void computeArea(double r)
{double areac;
areac=3.14*r*r;
System.out.println("Area of circle of given radius:"+areac);
}

}

