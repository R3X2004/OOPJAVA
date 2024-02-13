import java.lang.*;
import java.util.Scanner;

abstract class Employee {
    private String empName;
    private int empID;

    public Employee() {
        // Default constructor
    }

    public Employee(String name, int id) {
        // Parametrized Constructor
        this.empName = name;
        this.empID = id;
    }

    public void inputData(String name, int id) {
        this.empName = name;
        this.empID = id;
    }

    protected abstract void displayData(); // Abstract method

    // Getters and setters for private fields
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }
}

class Manager extends Employee {
    private double basicSalary;
    private byte DA; 
    private byte HRA;

   public Manager() {
       // Default constructor
   }

   public Manager(String name, int id, double salary, byte da, byte hra) {
       super(name, id);
       this.basicSalary = salary;
       this.DA = da;
       this.HRA = hra;
   }

   public void getInfo(double salary, byte da, byte hra) {
       this.basicSalary = salary;
       this.DA = da;
       this.HRA = hra; 
   }

   public void calSal() { 
      double totalSalary= basicSalary + DA + HRA; 
      System.out.println("Total Salary: " + totalSalary); 
  } 

  @Override
  protected void displayData() { 
      System.out.println("Employee Name: " + getEmpName()); // Accessing private field of superclass using getter method
      System.out.println("Employee ID: " + getEmpID()); // Accessing private field of superclass using getter method
      System.out.println("Basic Salary: " + basicSalary); 
      System.out.println("DA: " + DA); 
      System.out.println("HRA: " + HRA);  
  } 

}

	class Main {

     public static void main(String[] args) {

         // Testing Manager class
         Manager manager1= new Manager();
         manager1.inputData("Bob", 102);
         manager1.getInfo(50000.0 , (byte)2000 , (byte)1000 );
         manager1.displayData();
     }
}
