import java.util.Scanner;
public class Gcd_of_two {
	public static void main(String args[]) {
		int n1, n2, i, gcd=1;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter a number:");
		n1=s.nextInt();
		System.out.println("Enter another number:");
		n2=s.nextInt();
		for(i=1;i<=n1 && i<=n2;i++)
		{
			if(n1%i==0 && n2%i==0)
				gcd=i;
		}
		System.out.printf("Gcd of two number %d and %d is=\t %d ",n1,n2,gcd);
		
}


    
}