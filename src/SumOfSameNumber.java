import java.util.Scanner;

public class SumOfSameNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Take input from users");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1 == num2){
            int sum = num1 + num2;
            System.out.println(sum);
        } else if (num1 != num2) {
            int sum2 = (num1 + num2) * 2;
            System.out.println(sum2);
        }
    }
}
