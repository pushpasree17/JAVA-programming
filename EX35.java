import java.util.Scanner;

class EX35{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1, i = 1;

        do {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
            i++;
        } while (i <= n);
    }
}
