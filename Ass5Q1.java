import java.lang.*;
import java.util.Scanner;

class Employee {
    private String empName;
    private int empID;

    public Employee() {
        
    }

    public Employee(String name, int id) {
        this.empName = name;
        this.empID = id;
    }

    public void inputData(String name, int id) {
        this.empName = name;
        this.empID = id;
    }

    public void displayData() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empID);
    }
}

class Manager extends Employee {
    private double basicSalary;
    private byte DA; 
    private byte HRA;

   public Manager() {
      
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

 
  public void displayData() { 
      super.displayData(); 
      System.out.println("Basic Salary: " + basicSalary); 
      System.out.println("DA: " + DA); 
      System.out.println("HRA: " + HRA);  
  } 

}

	class Ass5Q1 {

     public static void main(String[] args) {

         // Testing Employee class
         Employee employee1= new Employee();
         employee1.inputData("Simddharth", 101);
         employee1.displayData();

         // Testing Manager class
         Manager manager1= new Manager();
         manager1.inputData("Ashutosh", 102);
         manager1.getInfo(50000.0 , (byte)200 , (byte)1000 );
         manager1.displayData();
     }
}
