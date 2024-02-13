import java.lang.*;
import java.util.Scanner;
class Employee {
  private String empName;
  private String empNo;
  private double basicSalary;

  Employee(String name, String eno, double salary) {
    empName = name;
    empNo = eno;
    basicSalary = salary;

  }

  void showEmpDetails() {
    System.out.println("Employee Name: " + empName);
    System.out.println("Employee Number: " + empNo);
    System.out.println("Basic Salary: " + basicSalary);
  }
}

class EmpTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of employees: ");
    int n = sc.nextInt();
    Employee[] empArray = new Employee[n];

    for (int i = 0; i < n; i++) {
      System.out.println("Enter the name, number and salary of employee " + (i + 1) + ": ");
      String name = sc.next();
      String eno = sc.next();
      double salary = sc.nextDouble();
      empArray[i] = new Employee(name, eno, salary);
    }

    for (int i = 0; i < n; i++) {
      System.out.println("Employee " + (i + 1) + " details: ");
      empArray[i].showEmpDetails();
    }
  }
}
