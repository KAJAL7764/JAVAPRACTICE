import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Take the input from users");
        int num = input.nextInt();
        long sum = sumOfDigits1(num);
        System.out.println("The sum of digits is: " + sum);
    }
    public static int sumOfDigits1(int num){
        int sum = 0;
        while (num > 0){
             sum += (num % 10);
            num /= 10;

        }
        return sum;
        }

    }

