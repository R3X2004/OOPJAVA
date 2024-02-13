import java.lang.*;
import java.util.Scanner;

class Employee {
    String empName;
    int empNo;
    double basicSal;
    double da;
    double hra;
    double grossSal;
	

    Employee() {

    }
	

    void inputEmpDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        empName = sc.nextLine();
        System.out.print("Enter employee number: ");
        empNo = sc.nextInt();
        System.out.print("Enter basic salary: ");
        basicSal = sc.nextDouble();
    }

    void calGrossSal() {
        da = 0.2 * basicSal;
        hra = 0.1 * basicSal;
        grossSal = basicSal + da + hra;
    }

    void showEmpDetails() {
        System.out.println("Employee Details:");
        System.out.println("-----------------");
        System.out.println("Name: " + empName);
        System.out.println("Number: " + empNo);
        System.out.println("Basic Salary: " + basicSal);
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("Gross Salary: " + grossSal);
    }
}

public class Ass3Q2 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.inputEmpDetails();
        emp.calGrossSal();
        emp.showEmpDetails();
    }
}
