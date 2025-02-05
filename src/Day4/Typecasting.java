package Day4;
class Employee{
    protected int Id;
    protected int salary;

    Employee(int id, int sal){
        Id = id;
        salary = sal;
    }
    void displayId(){
        System.out.println("id: " +Id);
    }
    void displaySalary(){
        System.out.println("salary: " +salary);
    }

}
class TeamLead extends Employee{
         int teamSize;

         TeamLead(int Id, int salary, int teamSize){
             super(Id,salary);
             this.teamSize = teamSize;
         }
         void displayId(){
             System.out.println("id from TeamLead: "+Id);
         }
         void displayTeamSize(){
             System.out.println("Team size: "+teamSize);
         }
}
public class Typecasting {
public static void main(String args[]){
    // object of employee
    Employee emp = new Employee(101,20000);
    emp.displayId();
    emp.displaySalary();

    // object of TeamLead
    TeamLead tl = new TeamLead(102,200000,5);
    tl.displayId();
    tl.displayTeamSize();

    // upcasting
    Employee upCast = new TeamLead(103,300000,10);
    upCast.displayId();
    upCast.displaySalary();
    //upCast.displayTeamSize();

    // downcasting
    TeamLead downCast = (TeamLead) upCast;
    downCast.displayId();
    downCast.displaySalary();
    downCast.displayTeamSize();


}
}
