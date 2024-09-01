import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {
        System.out.println("take input from users");
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();

        if (first >= second && first >= third){
            System.out.println(first + " is the greates number");
        }
        else if (second >= third && second >= first){
            System.out.println(second + " is Second the greates number");
        }
        else {
            System.out.println(third + " is the greates number");
        }

    }
}