
package multiplearrsy;

public class MultipleArrsy {

    public static void main(String[] args) {
   int firstarray[][]={{2,3,45,6},{5,9,0,67}};
   int secondarray[][]={{22,33,4,6},{53},{80,37,23}};  
   
    
        System.out.println("first array");
        display(firstarray);
        System.out.println("second array");
        display(secondarray);
    
}
    public static void display(int x[][]) {
        for(int r=0;r<x.length;r++)
        {
           for(int c=0;c<x[r].length;c++) {
               System.out.print(x[r][c]+"\t");
           }
            System.out.println();
        }
        
    }
}