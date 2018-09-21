package filedemo2;

import java.util.Formatter;
import java.util.Scanner;

public class FileDemo2 {

    public static void main(String[] args) {
        String name, id;
        try {
            Formatter formatter = new Formatter("C:/Users/rakibul/Documents/NetBeansProjects/FileDemo2/student.txt");
            Scanner input = new Scanner(System.in);
            System.out.println("how many students:");
            int num = input.nextInt();
            for (int i = 0; i < num; i++) {
                System.out.println("Enter a student name and id");
                id = input.next();
                name = input.next();

                formatter.format("%s %s\r\n", id, name);
            }

            formatter.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
