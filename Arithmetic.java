import java.util.Scanner;
class Arithmetic{
  public static void main(String[]args){
    try{
      int arr[]=new int[5];
      Scanner sc=new Scanner(System.in);
      int b=sc.nextInt();
      int a=10/0;
      arr[7]=5;
    }
    catch(ArithmeticException e){
      System.out.println("Division by zero Expression");
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Array index Index error");
    }
  }
}