import java.util.Scanner;

public class BitwiseOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("take the input from users");
         int num = input.nextByte();
                 if((num & 1) == 1){
                     System.out.println("It's odd number");

                 }
                 else {
                     System.out.println("It's even number");
                 }
    }
}
