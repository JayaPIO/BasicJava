package Week3Day3;
import java.util.*;
class Employee{
    int id;
    String name;
    int salary;

    Employee(int id, String name, int salary){
        this.id =id;
        this.name = name;
        this.salary = salary;
    }

    public String toString(){
        return "Employee id: "+id+ " name: "+name+" salary: "+salary;
    }
}

public class HashMapWithObject {

    public static void main(String[] args){

        HashMap<Integer,Employee> map = new HashMap<>();

        map.put(1,new Employee(101,"abx",10000));
        map.put(2,new Employee(102,"A",50000));
        map.put(3,new Employee(103,"B",120000));
        map.put(4,new Employee(104,"C",140000));
        map.put(5,new Employee(105,"D",150000));

        // printing map
        for (Map.Entry<Integer,Employee> entry: map.entrySet()){
            System.out.println(entry.getKey() +" -> "+entry.getValue());
        }

        // searching in map
        int employeeId = 2;
        if (map.containsKey(employeeId)) {

            System.out.println(map.get(employeeId));
        }

        // update in employee
        if (map.containsKey(employeeId)){
            Employee e = map.get(employeeId);
            e.salary = 100000;
            map.put(employeeId,e);
        }

        for (Map.Entry<Integer,Employee> entry: map.entrySet()){
            System.out.println(entry.getKey() +" -> "+entry.getValue());
        }

    }
}
