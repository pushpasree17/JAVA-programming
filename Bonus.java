import java.util.Scanner;
class Bonus{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    double sal=sc.nextDouble();
    double bonus;
    if(sal>=50000)bonus=sal*0.10;
    else if (sal>=30000)bonus=sal*0.07;
    else bonus=sal*0.05;
    System.out.println("bonus="+bonus);
  }
}