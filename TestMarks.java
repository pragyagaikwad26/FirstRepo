package equifax;

import java.util.Scanner;

public class TestMarks {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter your Subject : ");
//		int choice = sc.nextInt();
		
		System.out.println("Enter you marks in Physics");
		int phy = sc.nextInt();
		
		System.out.println("Enter you marks in Chemistry");
		int chem = sc.nextInt();
		
		System.out.println("Enter you marks in Maths");
		int maths = sc.nextInt();
		
		System.out.println("Enter you marks in Hindi");
		int hindi = sc.nextInt();
		
		System.out.println("Enter you marks in English");
		int  eng = sc.nextInt();2

		int total = phy+chem+maths+hindi+eng ;
		
		int percentage = (total/5);
		System.out.println("Percentage: " + percentage);
		
		if(percentage > 80 && percentage <=100)
			System.out.println("Congratulation !!! You got 1st Division");
		
		else if(percentage>=60 && percentage <=80)
			System.out.println("Congratulation !!! You got 2nd Division");
		
		else if(percentage>33 && percentage <60)
			System.out.println("Congratulation !!! You got 3rd Division");
		
		else
			System.out.println("Sorry !! We Appreciate your efforts but its not upto the bar");
		
	}
}
