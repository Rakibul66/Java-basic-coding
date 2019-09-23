
package pkgcontinue;


public class Continue {
//used to skip particular iteration of the loop
   
    public static void main(String[] args) {
        int intArray[]=new int[]{1,2,3,4};
        System.out.println("all number except for 3 are:");
        for(int i=0;i<intArray.length;i++)
        { if(intArray[i]==3)
            continue;
        else
                System.out.println(intArray[i]);
            }
                
        
    }
    
}
