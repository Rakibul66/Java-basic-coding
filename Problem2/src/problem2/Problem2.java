
package problem2;

import java.util.Scanner;

public class Problem2 {
    int x,y;
    Problem2(int a, int b)
    {
       x=a;
       y=b;
    }
    void show()
    {
        if(x>y)
        {
            System.out.println("Largest number is: " +x);
        }
        else
        {
            System.out.println("Largest number is: " +y);
        }
    }

    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int m,n;
        System.out.println("Enter the first number: ");
        m=s.nextInt();
        System.out.println("Enter the second number: ");
        n=s.nextInt();
        Problem2 p=new Problem2(m,n);
        p.show();
    }
    
}
