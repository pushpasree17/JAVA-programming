import java.util.Scanner;
public class EX28{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int fact=n;
    while(n>0){
      fact*=n;
      n--;
    }
    System.out.println(fact);
  }
}