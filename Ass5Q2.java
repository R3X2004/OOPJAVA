import java.lang.*;
import java.util.Scanner;

class Student {

  private String name; 
  private int roll; 


  public Student(String name, int roll) {
    this.name = name;
    this.roll = roll;
  }

 
  public void printStudent() {
    System.out.println("Name: " + name);
    System.out.println("Roll: " + roll);
  }
}


class Test extends Student {

  private int mark1; 
  private int mark2; 
  private int mark3; 


  public Test(String name, int roll, int mark1, int mark2, int mark3) {
    super(name, roll); 
    this.mark1 = mark1;
    this.mark2 = mark2;
    this.mark3 = mark3;
  }

  
  public void printTest() {
    super.printStudent();
    System.out.println("Marks in subject 1: " + mark1);
    System.out.println("Marks in subject 2: " + mark2);
    System.out.println("Marks in subject 3: " + mark3);
  }
}

class Result extends Test {
  
  private int total;

 
  public Result(String name, int roll, int mark1, int mark2, int mark3) {
    super(name, roll, mark1, mark2, mark3); 
    total = mark1 + mark2 + mark3; 
  }

 
  public void printResult() {
    super.printTest();
    System.out.println("Total marks: " + total);
  }
}


class Ass5Q2 {
  
  public static void main(String[] args) {
    
    Result r = new Result("Ashutosh", 70, 30, 95, 10);

    r.printResult(); 
  }
}
