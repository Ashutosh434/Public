package A6;
import A5.Employee;

// Java program to Sort a TreeSet with
// User Defined Objects

import java.io.*;
import java.util.*;
class Employees{

    private int id;
    private String name, department ;
    private Double salary;

    // constructor
    public Employees(int id, String name, String department, Double salary)
    {
        this.id=id;
        this.name=name;
        this.department = department;
        this.salary = salary;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name= name;
    }

    public int getid()
    {
        return id;
    }

    public String getDepartment() {
        return department;
    }
    public Double getSalary(){
        return salary;
    }
}

// Comparator class will override the compare
// method which will compare the tw objects
// passed in the parameter
class myIDComparator implements Comparator<Employees>
{

    public int compare(Employees s1, Employees s2)
    {
        return s1.getid()-s2.getid();
    }
}

class myNameComparator implements Comparator<Employees>
{
    public int compare(Employees s1, Employees s2)
    {
        return s1.getName().compareTo(s2.getName());
    }
}
class myDepartmentComparator implements Comparator<Employees>{
    public int compare(Employees s1, Employees s2){
        return s1.getDepartment().compareTo(s2.getDepartment());
    }
}
class mySalaryComparator implements Comparator<Employees>{
    public int compare(Employees s1, Employees s2){
        return s1.getSalary().compareTo(s2.getSalary());
    }
}

class Q3TreeSet {

    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        // Creating the TreeSet with Comparator object passed
        // as the parameter which will sort the user defined
        // objects of TreeSet
        TreeSet<Employees> set = new TreeSet<Employees>(new myIDComparator());
        TreeSet<Employees> ID = new TreeSet<Employees>(new myNameComparator());
        TreeSet<Employees> Dep = new TreeSet<Employees>(new myDepartmentComparator());
        TreeSet<Employees> Sal = new TreeSet<Employees>(new mySalaryComparator());

        set.add(new Employees(450,"Sam","Software Development",30000.0));
        set.add(new Employees(341,"Ronaldo","Software Development",100000.0));
        set.add(new Employees(134,"Daniel","Software Development",70000.0));
        set.add(new Employees(590,"George","Software Development",50000.0));
        set.add(new Employees(190,"Clone","QA",50000.0));
        set.add(new Employees(100,"D","HR",2000000.0));
        set.add(new Employees(420,"Roberto","QA",500000.0));
        set.add(new Employees(180,"Tokyo","Software Development",800000.0));
        set.add(new Employees(786,"Rachel","Manager",5000000.0));
        set.add(new Employees(1,"Professor","Boss",10000000.0));

        ID.add(new Employees(450, "Sam", "Software Development", 30000.0));
        ID.add(new Employees(341, "Ronaldo", "Software Development", 100000.0));
        ID.add(new Employees(134, "Daniel", "Software Development", 70000.0));
        ID.add(new Employees(590, "George", "Software Development", 50000.0));
        ID.add(new Employees(190, "Clone", "QA", 50000.0));
        ID.add(new Employees(100, "D", "HR", 2000000.0));
        ID.add(new Employees(420, "Roberto", "QA", 500000.0));
        ID.add(new Employees(180, "Tokyo", "Software Development", 800000.0));
        ID.add(new Employees(786, "Rachel", "Manager", 5000000.0));
        ID.add(new Employees(1, "Professor", "Boss", 10000000.0));

        Dep.add(new Employees(450, "Sam", "Software Development", 30000.0));
        Dep.add(new Employees(341, "Ronaldo", "Software Development", 100000.0));
        Dep.add(new Employees(134, "Daniel", "Software Development", 70000.0));
        Dep.add(new Employees(590, "George", "Software Development", 50000.0));
        Dep.add(new Employees(190, "Clone", "QA", 50000.0));
        Dep.add(new Employees(100, "D", "HR", 2000000.0));
        Dep.add(new Employees(420, "Roberto", "QA", 500000.0));
        Dep.add(new Employees(180, "Tokyo", "Software Development", 800000.0));
        Dep.add(new Employees(786, "Rachel", "Manager", 5000000.0));
        Dep.add(new Employees(1, "Professor", "Boss", 10000000.0));

        Sal.add(new Employees(450, "Sam", "Software Development", 30000.0));
        Sal.add(new Employees(341, "Ronaldo", "Software Development", 100000.0));
        Sal.add(new Employees(134, "Daniel", "Software Development", 70000.0));
        Sal.add(new Employees(590, "George", "Software Development", 50000.0));
        Sal.add(new Employees(190, "Clone", "QA", 50000.0));
        Sal.add(new Employees(100, "D", "HR", 2000000.0));
        Sal.add(new Employees(420, "Roberto", "QA", 500000.0));
        Sal.add(new Employees(180, "Tokyo", "Software Development", 800000.0));
        Sal.add(new Employees(786, "Rachel", "Manager", 5000000.0));
        Sal.add(new Employees(1, "Professor", "Boss", 10000000.0));

        System.out.println("Press a if you want sorted order of id, Press b if you want sorted order of Name," +
                " Press c if you want sorted order of Department, " +
                "Press d pif you want sorted order of Salary ");

        String str = sc.next();
        if (str.equals("a")) {
            System.out.println("Increasing Order with the ID");

            // Printing the TreeSet elements
            for (Employees ele : set) {
                System.out.print(ele.getid() + " " + ele.getName());
                System.out.println();
            }
        }
        else if (str.equals("b")) {
            System.out.println("Increasing Order with the Name");
            for (Employees ele : ID) {
                System.out.print(ele.getName() + " " + ele.getid() + " "+ ele.getDepartment());
                System.out.println();

            }
        }
        else if (str.equals("c")) {
            System.out.println("Increasing Order with the Name");
            for (Employees ele : Dep) {
                System.out.print(ele.getDepartment() + " " + ele.getid()+ "" + ele.getName());
                System.out.println();

            }
        }
        else if (str.equals("d")) {
            System.out.println("Increasing Order with the Name");
            for (Employees ele : Sal) {
                System.out.print(ele.getSalary() + " " + ele.getid() + "" + ele.getName());
                System.out.println();

            }


        }
    }
}
