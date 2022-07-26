package CoreJava;

import java.util.Scanner;

//do-while loop that asks the user to enter two numbers on the basis of input. 

public class Testdowhile {
public static void main (String []args) {
	
Scanner sc = new Scanner(System.in);
		
	int i=0;
	do {
	    	System.out.println("Enter The First number : ");
	    	int a = sc.nextInt();
	    		
	    	System.out.println("Enter The Second number : ");
	    	int b = sc.nextInt();
	    	
		    System.out.println("addition : " + (a+b));
		
		    System.out.println("you want to perform the operation again if yes then press 1 or if no then press 2");
		    System.out.println("Enter your choice: ");
		   i = sc.nextInt();
	}   
    while (i == 1);
	System.out.println("Thanks!!!!");
}
}


