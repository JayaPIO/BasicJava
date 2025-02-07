package Week3Day5;

import java.util.SortedSet;
import java.util.TreeSet;
class Person implements Comparable{
    String name;
    Integer age;

    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public Integer getAge(){
        return age;
    }
    public int hashCode(){
        return name.hashCode();
    }
    public boolean equals(Object o){
        return ((name == ((Person) o).getName()) && (age.equals(((Person) o).getAge())));
    }


    public  String toString(){
        return name +" "+ age;
    }
    @Override
    public int compareTo(Object o) {
        return age.compareTo(((Person)o).getAge());
    }
}
public class Sortedset {
    public static void main(String args[]){
     SortedSet<Person> set =new TreeSet<>();
     set.add(new Person("Jaya",21));
     set.add(new Person("Jaya",21));

        System.out.println(set);

        set.add(new Person("A",5));
        set.add(new Person("B",42));
        System.out.println(set);
    }
}
