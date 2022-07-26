package CoreJava;
//practising while loops basic
public class Testlastdigitnum {
public static void main(String[] args) {
	int num=235;
	while (num>0){
    System.out.println("last digit number : " + num%10);

	num = num/10;
}
}
}
