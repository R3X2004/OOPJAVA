# OOPJAVA
Ass-1
1. Write a java program that will display “This is my first Java Program”.
2. Write a java program to demonstrate all arithmetic operators, bitwise operators in a single
program.
3. Write a java program that will print your name 5 times. (Hints: Use for Loop)
4. Write a Java program to test the number is prime or composite.
5. Write a java program that will take input as two +ve integers M and N where M<N.
a). The program will display the numbers between M and N, which are divisible by 3
and 5.
b). Count the numbers which are divisible by 3 and 5(between M and N), then add those
numbers and display.
6. Write a java program that will count the number of primes between 37 and 129.
7. Write a Java program that will evaluate the following exponential series.

Ass-2
1. Write a java program that will search a number from an array of 10 inputted numbers and
show the positon of searched number in the array.
2. Write a java program that will sort an array of N inputted numbers in Descending order and
display.
3. Write a java program that will read array of N numbers, and it will remove the duplicate
numbers (if any) and display the array.
4. Write a java program to do following

a. Create two 3x3 matrix and input data to it.
b. Add above two matrix and store in third matrix and display it.
c. Transpose the third matrix and display.

Ass-3
1
Design a class Number having num as its data member, and member functions as
setNum(), displayNum(), factorial(), isPrime(), sumOfDigit(), reverseNum().
In main function create an object of Number class and call each function sequentially as in
list.

2.
Develop a java program that will deal with employee information of an organization.
Define a class Employee. Minimum number of data member and member function are as
follows:
Data members: empName, empNo, basicSal, da, hra, grossSal
Methods: inputEmpDetails(), calGrossSal(), showEmpDetails()
You are free to add more number of relevant data member and member function. Use the
method inputEmpDetails() to input the employee details, method calGrossSal() to ccalculate
the gross salary and method showEmpDetails() to display the detail information of the
employees in a tabular manner. Note that da is 20% of basicSal and hra is 10% of basicSal.
grossSal is the sum of basicSal, da and hra.

3
Develop a java program that will deal with Library information of an organization.
Define a class Library. Minimum number of data member and member function are as
follows:
Data members: bookName, bookNo, NoofPages, price, AuthorNames
Methods: addBook(), showBookInfo()
Using array store N number of books and display it. N will be entered by user at runtime.

Ass-4
1.
Define a class Employee with the following members:
Data members: private String empName
private String empNo
private double basicSalary

Constructor:Employee(String name, String eno, double salary)
Methods: void showEmpDetails()
Write a separate class called EmpTest with a main method that define an array of n
employees where the value of n will be inputted by the user. Read and store the
information of all n employees. Display the details of the employees.

2.
Create a class Account having data members accNo, balance, timePeriod and
intInYears(as static and initialize with 7.5%). The class should also contain the following
methods:
• float calculateInterst() which calculates and returns the interest amount.
• void showAccDetails() which displays account number, balance and calculated
interest amount.
• static void changeIntRate(float newRate) which changes the interest rate to newRate.
Create an array of object of the class Account. Store the details of each object through the
parameterized constructor. Display all the account details by calling the method
showAccDetails(). Change the interest rate to a new one by calling the function
changeIntRate(). Finally display the account details after the change in interest rate.

Ass-5
1. Design following class hierarchies.
Employee

-empName (String)

-empID (int)

+Default constructor

+Parameterised constructor

+inputData()

+displayData()

Manager

-basicSalary (Double)

-DA (byte)

-HRA (byte)

+Default constructor

+Parameterised constructor

+getinfo()

+calSal()

+printinfo()
Note that the items with a minus sign (-) indicate private members and items with a plus sign
(+) indicate public members.
Test the methods of both the classes by creating objects in the main method of another class.

2. Design following class hierarchies.
Student

name, roll

Constructor printStudent()

Test

mark 1, mark 2, mark3

Constructor printTest()

Result

total

Constructor printResult()
Data members are private, constructors and methods are public. Test the methods of all classes
by creating objects of Result class in the main method of another class.

3.Modify the above program to demonstrate the method overriding.

Ass-6
1
Define an abstract class named “GeometricFigure”, having data members dim1 and
dim2. Extend this class to create two concrete classes named as Rectangle and
Triangle. Override the getArea() method in the sub classes. Invoke the getArea()
method in the main method of another Driver class through the abstract class
reference variable.

2 Modify the program of Assignment 5 Question 1 where make the Employee class abstract.

3 Write a program to create a class named Shape. It should contain two methods,
draw() and erase() that prints “Drawing Shape” and “Erasing Shape”
respectively. For this class, create three sub classes, Circle, Triangle and Square
and each class should override the parent class functions - draw () and erase
(). The draw() method should print “Drawing Circle”, “Drawing Triangle” and
“Drawing Square” respectively. The erase() method should print “Erasing Circle”,
“Erasing Triangle” and “Erasing Square” respectively. Create objects of Circle,
Triangle and Square, assign each to Shape variable(reference) and call draw() and
erase() method using each object.

Ass-7
1
Define an interface Calculator which has the basic methods add(), sub( ), mul()
and div(). Define a concrete class named as DemoCalculator that implements the
interface. Define the driver class, which create object reference of the interface
Calculator and perform all basic operation of the calculator.

2
Write an exception handling java program to read two numbers n1,n2 and calculate
and print the result of n1/n2. If n2 is Zero (0) then it will be handled by exception
handler and again ask the value of n2. In the exception handler the program should
display appropriate message to the user.

3
Write an exception handling java program to print the index position of an existing
integer array. The index value will be entered by user. It will be handled by exception
handler if index position is greater than the size of array. In the exception handler
the program should display appropriate message to the user.

4
Write a java program to read two numbers x and y and calculate x/(x−y). The
program should check the value of x−y. Before dividing with x, it should throw an
exception if x−y is zero. In the exception handler the program should display
appropriate message to the user.

Ass-8
1.
Write a java program that will create one child thread. The child thread has to display all
Even numbers between m and n, and the main thread will display all the Odd numbers
between m and n.
2. Write a java program to create two threads. First thread should find the square of the number,
second thread should find the factorial of the number.

3
Create program that creates three tasks and three threads to run them. The first thread prints
the letter A, 100 times and the second thread prints the letter B, 100 times. The third thread
prints the integers 1 through 100.

Ass-9
1
Create program that creates two thread. The first thread prints the letter A, 100 times and the
second thread prints the letter B, 100 times. Using join() method do the above task.
2 Write the above program using synchronized method.

3
Create program that creates two threads. The first thread prints the string “Hello” 50 times
and the second thread prints the string “Hi” 50 times. Using synchronized block do the above
task.
4
Write a multithreading java program to print multiplication table of no1,no2,no3. no1,no2 &
no3 will be inputted by user at runtime. Use join() method to do the above task sequentially.
5 Write the above program 4 using synchronized method.

Ass-10
1
Write a JAVA program using String class to reverse the following string containing days of
a week.
Suppose, String days = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday";
Using the methods of String class manipulate the string days in such a way that when we
print the string days it should display Sunday Saturday Friday Thursday Wednesday Tuesday
Monday
*Use the while loop, lastIndexOf method, substring method of String class
2
Write a JAVA program to remove multiple spaces in a string.
Sample Output: If the given string is String With Multiple Spaces
The output should be String With Multiple Spaces
• Use indexOf, substring & trim method

3
Write a JAVA program to capitalize first letter of each word in an inputted sentence from
keyboard.
Sample Output:
Enter a sentence: india is great
India Is Great
4 Write the Qn. 1 using StringBuffer class

Ass-11
1
Write a java awt program - Create three color buttons (with caption “Red”, “Blue” and “Green”) and
a text label. Initially the text should be displayed in black color. When the user clicks on a particular
color button the text should be changed to that particular color as shown in the figure.
2
Write a java awt program to creates three push buttons showing three different colors as their label.
When a button is clicked, that particular color is set as background color in the frame.
3
Write a java awt program, which will create 3 text field and one button labelled as add. The program
will take the input from the two text filed and upon pressing the add button it will display the result
in the third text field.

