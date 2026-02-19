import java.util.Scanner;
class StudentDetails {
    String name;
    int rollNo;

    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
    }
    void displayDetails() {
        System.out.println("\nStudent Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}
class Marks extends StudentDetails{
    int m1, m2, m3;
    int total;
    double average; 
    void getMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Mark 1: ");
        m1 = sc.nextInt();
        System.out.print("Enter Mark 2: ");
        m2 = sc.nextInt();
        System.out.print("Enter Mark 3: ");
        m3 = sc.nextInt();
    }
    void calculate() {
        total = m1 + m2 + m3;
        average = total / 3.0;
    }
    void displayResult() {
        System.out.println("\nMarks 1: " + m1);
        System.out.println("Marks 2: " + m2);
        System.out.println("Marks 3: " + m3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}
public class Details{
    public static void main(String[] args){
      Marks s1 = new Marks();
        s1.getDetails();  
        s1.getMarks();    
        s1.calculate();
        s1.displayDetails();
        s1.displayResult();
    }
}

