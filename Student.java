
import java.util.*;
public class Student {
	int rollno;
	String name;
	int sub1;
	int sub2;
	int sub3;
	float total;
    
	public Student() {
		
		
		
	}
	public void enter_det() {
		Scanner in=new Scanner(System.in) ;
		System.out.println("Enter roll number:");
		rollno=in.nextInt();
		System.out.print("\nEnter name of the student:");
		name=in.next();
		System.out.println("Enter marks for subject 1:");
		sub1=in.nextInt();
		System.out.println("Enter marks for subject 2:");
		sub2=in.nextInt();
		System.out.println("Enter marks for subject 3:");
		sub3=in.nextInt();
		
	}
	//public void cal() {
		//total=sub1+sub2+sub3;
		
	//}
	public void disp_details() {
		System.out.println("Roll number:"+rollno);
		System.out.println("Name"+name);
		System.out.println("Marks for subject 1:"+sub1);
		System.out.println("Marks for subject 2:"+sub2);
		System.out.println("Marks for subject 3:"+sub3);
		total=sub1+sub2+sub3;
		if(sub1<50||sub2<50||sub3<50) {
			total=0;
			System.out.println("-----> Failed");
		}
		else {
			System.out.println("----> Pass");
		}
		System.out.println("Total marks:"+total);
	}

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students:");
		num=sc.nextInt();
		Student[] S=new Student[num];
		for(int i=0;i<num;i++) {
			S[i]=new Student();
			System.out.println("Enter details of student "+(i+1)+" :");
			S[i].enter_det();
			System.out.println("Displaying details of student "+(i+1)+" :");
			S[i].disp_details();
		}
		
		

	}

}
