package CoreJava;
//practising of if else loop performing arithmetic operations

import java.util.Scanner;

public class testinput {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your choice : ");
	int choice = sc.nextInt();
	
	System.out.println("Enter The value of A : ");
	int a = sc.nextInt();
	
	System.out.println("Enter The value of B : ");
	int b = sc.nextInt();

	if (choice == 1) 
		System.out.println("addition : " + (a+b));

	else if (choice == 2) 
		System.out.println("substraction : " + (a-b));

    else if (choice == 3)
    	System.out.println("multiplication : " + (a*b));

    else if (choice == 4)
		System.out.println("division : " + (a/b));
}
}

