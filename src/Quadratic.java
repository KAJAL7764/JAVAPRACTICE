import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    int a = input.nextInt();
    int b = input.nextInt();
    int c = input.nextInt();
    float discriminant = b * b - 4 * a * c;
		if (discriminant > 0){
            // two real and distinct roots
           double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Root 1 is: " + root1);
            System.out.println("Root 2 is: " + root2);
        } else if (discriminant == 0) {
            //one real and repeated root
            double root = -b / (2 * a);
            System.out.println("Root is: " + root);
        }
        else {
            //two complex root
            double realPart = -b / (2 * a);
            double imaginaryNumber = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Root 1 is: " + realPart + " + " + imaginaryNumber + "i");
            System.out.println("Root 2 is: " + realPart + " - " + imaginaryNumber + "i");
        }
    }
}

