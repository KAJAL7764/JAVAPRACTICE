import java.util.Scanner;

public class Factorial {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Take the input from users");
            int num = input.nextInt();
            long fact = factorial(num);
            System.out.println("The factorial " + num + " is: " + fact);
        }
        public static long factorial(int num){
        long fact = 1;
            if (num < 2){
                return 1;
            }
            int i = 2;
            for (i = 2; i <= num; i++){
            fact *= i;
            }
            return fact;
        }
    }

