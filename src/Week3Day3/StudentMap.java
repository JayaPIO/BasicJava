package Week3Day3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentMap {
    private Map<Integer,Map<String,String>> studentRecord ;
    StudentMap(){
        studentRecord = new HashMap<>();
    }

    // add a student
    public void addStudent(int id, String name, String department){
        Map<String,String> student = new HashMap<>();
        student.put(name,department);
        studentRecord.put(id,student);

    }

    // get student information
    public Map<String, String> getStudent(int id){
        return studentRecord.get(id);
    }

    // remove a student
    public void remove(int id){
        studentRecord.remove(id);
    }

    // list of students
    public void listStudents(){
        for(Map.Entry<Integer, Map<String, String>> entry : studentRecord.entrySet()){
            Map<String,String> map = entry.getValue();
            System.out.println(entry.getKey() +" " + entry.getValue());
        }
    }

    public static void main(String[] args){

        StudentMap students = new StudentMap();
        students.addStudent(1,"Joey","ECE");
        students.addStudent(2,"monica","CSE");

        System.out.println( students.getStudent(2));

        System.out.println(students.getStudent(1));

//        students.remove(1);
        System.out.println(students.getStudent(1));

        students.listStudents();
    }
}
