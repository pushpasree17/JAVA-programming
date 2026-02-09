import java.util.Scanner;

class EX33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0;

        do {
            System.out.print("Enter a number: ");
            num = sc.nextInt();
            sum += num;
        } while (num != 0);

        System.out.println("Sum = " + sum);
    }
}
