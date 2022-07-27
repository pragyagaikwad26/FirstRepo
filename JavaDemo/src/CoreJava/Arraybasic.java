package CoreJava;
//declaring and initializing 2D array  

public class Arraybasic {	
public static void main(String args[]) {  
		
	int ar[][]={{1,2,3},{2,4,5},{4,4,5}};  //integer declaration
		//printing 2D array 
	
	for(int i=0;i<3;i++){ //using for loop where i is equal to 0 and i is less than 3 and then incrementing.
	for(int j=0;j<3;j++){  
		
		   System.out.print(ar[i][j]+" ");  
}  
		 System.out.println();  
}  
}  
}
