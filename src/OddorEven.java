import java.util.Scanner;

public class OddorEven {
    public static void main(String[] args) {
        System.out.println("take input from users");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a / 2 == 0){
            System.out.println("It's is a even number");
        }
        else {
            System.out.println("It's a odd number");
        }
    }
}