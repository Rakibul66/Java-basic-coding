
package average;

public class Average {

    public static void main(String[] args) {
        System.out.println(average(24,34,76,89));
    }
    public static int average(int... numbers){
        int total=0;
        for(int x:numbers)
           total+=x; 
        return total/numbers.length;
    }
}
