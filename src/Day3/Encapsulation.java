package Day3;

class Student{

    private int id;

    public void setId(int id) {
        this.id = id;
    }
    public int getId(){
        return id;
    }
}

public class Encapsulation {
    public static void main(String[] args){
        Student st = new Student();
        st.setId(101);
        System.out.println(st.getId());
    }
}
