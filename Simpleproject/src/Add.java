import java.util.Scanner;
public class Add {
public static void main(String args[]) {
	System.out.println("enter a number:");
	Scanner s=new Scanner(System.in);
	int a,b;
	a=s.nextInt();
	System.out.println("enter sec number:");
	b=s.nextInt();
	int sum;
	sum=a+b;
	System.out.println("sum is:"+sum);
}
}

