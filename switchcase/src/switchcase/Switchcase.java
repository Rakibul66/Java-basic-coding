
package switchcase;
 import java.util.Scanner;

public class Switchcase {

    
    public static void main(String[] args) {
        int a;
        Scanner score =new Scanner(System.in);
        System.out.println("enter value :");
        a=score.nextInt();
       switch(a){
           case 1:
               System.out.println("very good");
               break;
           case 2:
               System.out.println("good");
               break;
           default:
               System.out.println("grade are not define");
               break;
    }
    
}
}
