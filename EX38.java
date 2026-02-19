import java.util.Scanner;
class EX38 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            System.out.print("Enter a number: ");
            num = sc.nextInt();
            if (num < 0) {
                System.out.println("Negative number entered. Program stopped.");
                break;
            }
        }
    }
}
