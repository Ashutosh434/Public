package A5;

public class Employee<N,T,U, S> {
    N id;
    T name;
    N salary;
    T department;

    public Employee(N id, T name, N salary, T department){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
    public void displayDetails(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
        System.out.println(department);
    }
}
class EmployeeMain{
    public static void main(String[] args) {
        Employee<Integer,String,Integer,String> obj = new Employee<Integer, String, Integer, String>(1001, "ASH",
                1000,"Software Development");
        obj.displayDetails();
    }
}
