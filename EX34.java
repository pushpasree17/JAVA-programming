import java.util.Scanner;

class EX34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int i = 2;
        do {
            int count = 0;
            int j = 1;

            do {
                if (i % j == 0)
                    count++;
                j++;
            } while (j <= i);

            if (count == 2)
                System.out.println(i);

            i++;
        } while (i <= n);
    }
}
