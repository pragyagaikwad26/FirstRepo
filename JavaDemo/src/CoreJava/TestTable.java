package CoreJava;
// Practising of while or do while loops print table of a number

public class TestTable {
public static void main (String args[]) {
	System.out.println("TABLE OF 2 ---> ");
int i=11;
while (i<=10){
	System.out.println("2 x " + i + " = " + 2*i);
  i++;
}

System.out.println();

System.out.println("TABLE OF 3 ---> ");
do {
	System.out.println("3 x " + i + " = " + 3*i);
}while (i<=10);

}
}


