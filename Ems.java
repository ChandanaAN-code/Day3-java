import java.util.Scanner;
abstract class Employee
{
    String name;
    int empid;
    double salary;
    abstract void calculateSalary(double hra,double basicsalary,double bonus,double deduction ,int tmie);
    
}
class FullTimeEmployee extends Employee
{
    void calculateSalary(double hra,double basicsalary,double bonus,double deduction,int time)
    { 
        double grosssalary=(basicsalary*time)+hra+bonus;
        double netsalary=grosssalary-deduction;
        System.out.println("Total  Employee salary:"+netsalary);
    }
}
class PartTimeEmployee extends Employee
{
    void calculateSalary(double hra,double basicsalary,double bonus,double deduction,int time)
    { 
      double grosssalary=(basicsalary*time)+hra+bonus;
        double netsalary=grosssalary-deduction;
        System.out.println("Total  Employee salary:"+netsalary);
    }
}
public class Ems {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("---Enter Full Time Employee Details:---");
        FullTimeEmployee f=new FullTimeEmployee();
        System.out.println("Enter Employee Name:");
        f.name=sc.nextLine();
        System.out.println("Enter employee Id:");
        f.empid=sc.nextInt();
        System.out.println("Enter Basic salary:");
        double b1=sc.nextDouble();
        System.out.println("Enter HRA:");
        double h1=sc.nextDouble();
        System.out.println("Enter Bonus:");
        double bo1=sc.nextDouble();
        System.out.println("Enter Time:");
        double t1=sc.nextDouble();
        System.out.println("Enter Deduction:");
        int d1=sc.nextInt();
        System.out.println("Employee Name:"+f.name);
        System.out.println("Employee id:"+f.empid);
        f.calculateSalary(h1,b1,bo1,t1,d1);
        System.out.println("---Enter Part Time Employee Details:---");
        PartTimeEmployee p=new PartTimeEmployee();
        sc.nextLine();
        System.out.println("Enter Employee Name:");
        p.name=sc.nextLine();
        System.out.println("Enter employee Id:");
        p.empid=sc.nextInt();
        System.out.println("Enter Basic salary:");
        double b2=sc.nextDouble();
        System.out.println("Enter HRA:");
        double h2=sc.nextDouble();
        System.out.println("Enter Bonus:");
        double bo2=sc.nextDouble();
        System.out.println("Enter Time:");
        double t2=sc.nextDouble();
        System.out.println("Enter Deduction:");
        int d2=sc.nextInt();
        System.out.println("Employee Name:"+p.name);
        System.out.println("Employee id:"+p.empid);
        p.calculateSalary(h2,b2,bo2,t2,d2);
    }
    
}
