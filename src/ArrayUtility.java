import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Take the input size from user: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("Enter element no " + (i + 1) + ": ");
            nums[i] = input.nextInt();
            i++;
        }
        return nums;
    }
    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Take the input(Rows) size from user: ");
        int Rows = input.nextInt();
        System.out.println("Take the input(Cols) size from user: ");
        int Cols = input.nextInt();
        int[][] numArray = new int[Rows][Cols];

        int i = 0;
        while (i < Rows) {
            int j = 0;
            while (j < Cols){
                System.out.println("Enter element row: " + (i + 1) + ", column:  " + (j + 1) + " :");
                numArray[i][j] = input.nextInt();
                j++;
            }

            i++;
        }
        return numArray;
    }


    public static void DisplayArray(int[] numArray) {
        int i = 0;
        while (i < numArray.length) {
            System.out.print(numArray[i] + " ");
            i++;
        }
        System.out.println();
    }
}