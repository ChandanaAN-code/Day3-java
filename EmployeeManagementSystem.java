import java.util.Scanner;

abstract class Employee {
    String name;
    int empid;
    double salary;

    abstract void calculatefulltimeSalary(double hra, double basicsalary, double bonus, double deduction, int tmie);

}

abstract class Employee1 {
    String name;
    int empid;
    double salary;

    abstract void calculatepartTimeSalary(double hourlyrate, double bonus, double deduction, int hours);

}

class FullTimeEmployee extends Employee {
    void calculatefulltimeSalary(double hra, double basicsalary, double bonus, double deduction, int time) {
        double grosssalary = (basicsalary * time) + hra + bonus;
        double netsalary = grosssalary - deduction;
        System.out.println("Total  Employee salary:" + netsalary);
    }
}

class PartTimeEmployee extends Employee1 {
    void calculatepartTimeSalary(double hourlyrate, double bonus, double deduction, int hours) {
        double grosssalary = (hourlyrate * hours) + bonus;
        double netsalary = grosssalary - deduction;
        System.out.println("Total  Employee salary:" + netsalary);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Employee Management System-----");
        System.out.println("Enter Employee Type:1.Full Time Employee 2.Part Time Employee");
        int choice = sc.nextInt();
        System.out.println("---Enter Full Time Employee Details:---");
        if (choice == 1) {
            FullTimeEmployee f = new FullTimeEmployee();
            sc.nextLine();
            System.out.println("Enter Employee Name:");
            f.name = sc.nextLine();
            System.out.println("Enter employee Id:");
            f.empid = sc.nextInt();
            System.out.println("Enter Basic salary:");
            double b1 = sc.nextDouble();
            System.out.println("Enter HRA:");
            double h1 = sc.nextDouble();
            System.out.println("Enter Bonus:");
            double bo1 = sc.nextDouble();
            System.out.println("Enter Time:");
            double t1 = sc.nextDouble();
            System.out.println("Enter Deduction:");
            int d1 = sc.nextInt();
            System.out.println("Employee Name:" + f.name);
            System.out.println("Employee id:" + f.empid);
            f.calculatefulltimeSalary(h1, b1, bo1, t1, d1);
        } else if (choice == 2) {
            PartTimeEmployee p = new PartTimeEmployee();
            sc.nextLine();
            System.out.println("Enter Employee Name:");
            p.name = sc.nextLine();
            System.out.println("Enter employee Id:");
            p.empid = sc.nextInt();
            System.out.println("Enter Hourly Rate:");
            double hr = sc.nextDouble();
            System.out.println("Enter Bonus:");
            double bo2 = sc.nextDouble();
            System.out.println("Enter No of hours worked:");
            int h = sc.nextInt();
            System.out.println("Enter Deduction:");
            double d2 = sc.nextDouble();
            System.out.println("Employee Name:" + p.name);
            System.out.println("Employee id:" + p.empid);
            p.calculatepartTimeSalary(hr, bo2, d2, h);
        } else {
            System.out.println("Invalid choice");
        }

    }
}