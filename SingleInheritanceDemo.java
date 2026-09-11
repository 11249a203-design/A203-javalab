class Employee {
    int empId;
    String name;
    double basicSalary;
Employee(int id, String n, double basic) {
empId = id;
name = n;
basicSalary = basic;
}
}
class PermanentEmployee extends Employee {
double hra, da;
PermanentEmployee(int id, String n, double basic, double h, double d) {
super(id, n, basic);
hra = h;
da = d;
}
 void display() {
double grossSalary = basicSalary + hra + da;
 System.out.println("Employee ID: " + empId);
System.out.println("Employee Name: " + name);
System.out.println("Basic Salary: " + basicSalary);
System.out.println("HRA: " +hra);
System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        PermanentEmployee emp = new PermanentEmployee(101, "Rahul", 30000, 5000, 3000);
        emp.display();
    }
}