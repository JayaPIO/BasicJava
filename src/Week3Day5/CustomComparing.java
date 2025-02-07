package Week3Day5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class Student  {
    private String name;
    private double cgpa;

    Student(String name, double cgpa){
        this.name = name;
        this.cgpa= cgpa;
    }

    public double getCgpa(){
        return cgpa;
    }
    public String toString(){
        return name+" "+ cgpa;
    }
}
class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student obj1, Student obj2) {

            if (obj2.getCgpa() - obj1.getCgpa()>1){
                return 1;
            } else if (obj2.getCgpa() - obj1.getCgpa()<1) {
                return -1;
            }
            else{
                return 0;
            }

    }
}

public class CustomComparing {
    public static void main(String args[]){
        List<Student> list = new ArrayList<>();

        list.add(new Student("rahul",8.2));
        list.add(new Student("Arjun",8.9));
        list.add(new Student("Siya",3.7));

        Collections.sort(list,new StudentComparator());

        for (Student stu: list){
            System.out.println(stu);
        }


    }
}
