/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filedemo;
import java.io.File;
public class FileDemo {

    public static void main(String[] args) {
         File dir=new File("pollice");
       dir.mkdir();
       File file1=new File("student.txt");
       File file2=new File("teacher.txt");
       try{
           file1.createNewFile();
           file2.createNewFile();
           System.out.println("files are created");
       }
       catch(Exception e){
           System.out.println(e);
       }
    }
    
}
