import java.util.Scanner;

public class PositiveNorZERO {
    public static void main(String[] args) {
        System.out.println("take input from zero");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a > 0){
            System.out.println("It's postive number");
        } else if (a == 0) {
            System.out.println("Equal to zeroo");

        }
        else {
            System.out.println("It's negative number");
        }
    }
}
