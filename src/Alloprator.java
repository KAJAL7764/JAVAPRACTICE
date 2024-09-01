import java.util.Scanner;

public class Alloprator {

    public static void main(String[] args) {
        System.out.println("Basic calculator");
        Scanner input = new Scanner(System.in);
        System.out.println("take input from users: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a + b;
        System.out.println("sum is: " + sum);
        System.out.println("take input from users: ");
        int c = input.nextInt();
        int d = input.nextInt();
        int diff = c - d;
        System.out.println("diff is: " + diff);

        System.out.println("take input from users: ");
        int m = input.nextInt();
        int n = input.nextInt();
        int mult = m * n;
        System.out.println("diff is: " + mult);

        System.out.println("take input from users: ");
        int x = input.nextInt();
        int y = input.nextInt();
        int div = x / y;
        System.out.println("diff is: " + div);
    }

}
