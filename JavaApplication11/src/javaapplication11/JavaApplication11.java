/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;
import java.io.File;
public class JavaApplication11 {

    public static void main(String[] args) {
       File dir=new File("person");
       dir.mkdir();
       String dirlocation=dir.getAbsolutePath();
        System.out.println(dirlocation);
        System.out.println(dir.getName());
        if(dir.delete()){
            System.out.println(dir.getName()+"Folder deleted");
        }
    }
    
}
