import java.util.Scanner;
class EX30{
  public static void main(String[]args){
    int n=145,temp=n,sum=0;
    while(n>0){
      int d=n%10;
      sum+=d*d*d;
      n/=10;
    }
    System.out.println(temp==sum);
  }
}