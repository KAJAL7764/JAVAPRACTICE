import java.util.Scanner;

public class LogicOprator {
    public static void main(String[] args) {
        System.out.println("Take input from users");
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int result = first << 4;
        int result2 = first >> 4;
        System.out.println("The result is: " + result);
        System.out.println("The result is: " + result2);
       /* int second = input.nextInt();
        int result = first & second;
        int results = first | second;
        int results1 = first ^ second;
        int results2 = ~first;
        System.out.println("The Result is: " + result);
        System.out.println("The Result is: " + results);
        System.out.println("The Result is: " + results1);
        System.out.println("The Result is: " + results2);*/


    }
}
