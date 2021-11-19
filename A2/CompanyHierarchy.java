package A2;
import java.util.*;
class EmployeeInfo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();

        Employee obj = new Employee();
        obj.salaryinfo(salary);
        Manager obj1 = new Manager();
        obj1.salaryinfo(salary);
        Labour obj2 = new Labour();
        obj2.salaryinfo(salary);
    }

}
class Employee {
    void salaryinfo(int salary){
        System.out.println("Original salary: "+salary);
    }

}
class Manager extends Employee{
int hike1 = 5000;
void salaryinfo(int salary){
    int newsalary1 = salary+hike1;
    System.out.println("Salary with incentive: "+ (newsalary1));
}
}
class Labour extends Employee{
    int hike2 = 500;
void salaryinfo(int salary){
    int newsalary2 = salary+hike2;
    System.out.println("Salary with overtime: "+ newsalary2);
}
}


