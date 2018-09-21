
package studentlist;

import java.util.LinkedList;
public class StudentListDemo {
       public static void main(String[] args) {
        LinkedList<Student> studentlist=new LinkedList<Student>();
        Student s1=new Student(66,"roxy","6th");
        Student s2=new Student(61,"tushar","6th");
        Student s3=new Student(43,"maheen","6th");
        studentlist.add(s1);
        studentlist.add(s2);
        studentlist.add(s3);
        for(Student s:studentlist){
            System.out.println(s.id+" "+s.name+" "+s.ClassName);
        }
    }
       
}
