package equifax;

import java.util.Scanner;

public class TablePrint {
	public static void main(String[] args) {
		
    Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number for which you want to print the table : ");
		int num = sc.nextInt();
		
		System.out.println("Table of "+ num +"-->");
		
		for(int i = 1;i<=10;i++) {
			System.out.println(num+" x " + i + " = " + num*i);
		}
		
	}
}
