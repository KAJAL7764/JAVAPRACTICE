import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Take the input from users");
        int num = input.nextInt();
        int sum = oddSum(num);
        System.out.println("The oddSum "+ num + " is: " + sum);
    }
    public static int oddSum(int num){
        int sum = 0;
        int i = 1;
        for (i = 1; i <= num; i+=2){
            sum += i;
        }
        return sum;
    }
}
