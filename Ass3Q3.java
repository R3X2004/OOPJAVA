import java.lang.*;
import java.util.Scanner;

class Library {
    String bookName;
    int bookNo;
    int NoofPages;
    double price;
    String AuthorNames;

    public void addBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book name: ");
        bookName = sc.nextLine();
        System.out.print("Enter book number: ");
        bookNo = sc.nextInt();
        System.out.print("Enter number of pages: ");
        NoofPages = sc.nextInt();
        System.out.print("Enter price: ");
        price = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter author name: ");
        AuthorNames = sc.nextLine();
    }

    public void showBookInfo() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Book Number: " + bookNo);
        System.out.println("Number of Pages: " + NoofPages);
        System.out.println("Price: " + price);
        System.out.println("Author Name: " + AuthorNames);
    }
}

public class Ass3Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        Library[] books = new Library[n];
        for (int i = 0; i < n; i++) {
            books[i] = new Library();
            System.out.println("Enter details of book " + (i + 1) + ":");
            books[i].addBook();
        }
        System.out.println("Details of all books:");
        for (int i = 0; i < n; i++) {
            System.out.println("Book " + (i + 1) + ":");
            books[i].showBookInfo();
        }
    }
}
