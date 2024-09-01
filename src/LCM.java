import java.util.Scanner;

public class LCM { public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Take the input from users");
    int first = input.nextInt();
    int second = input.nextInt();
    long lcm = lcm(first, second);
    System.out.println("LCM of the two numbers is: " + lcm);
}
public static int lcm(int num1, int num2){
    int i = 1;
    while (i <= num2){
        int factor = num1 * i;
        if (factor % num2 == 0) {
            return factor;
        }
        i++;
    }
    return 0;
}


}
