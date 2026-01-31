import java.util.Scanner;
class ElectricityBill{
public static void main(String[]args){
 Scanner sc=new Scanner(System.in);
      int u=sc.nextInt();
      int bill;
      if(u<=100)
         bill=u*1;
      else if(u<=200)
         bill=100*1+(u-100)*2;
      else
        bill=100*1+100*2+(u-200)*3;
      System.out.println("Bill=$"+bill);
    }
  }
    