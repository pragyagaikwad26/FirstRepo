package CoreJava;

import java.util.Scanner;

public class testarithmatic {
public static void main(String args[]){
	
	int a=100,b=20;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your choice : ");
	int choice = sc.nextInt();

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
