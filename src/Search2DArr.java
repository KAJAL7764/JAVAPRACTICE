import java.util.Scanner;

public class Search2DArr {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Searching in 2D arrays");
        int[][] numArr = ArrayUtility.input2DArray();
        System.out.println("Now enter the number you want to search: ");;
        int num = input.nextInt();
        boolean isFound = search(numArr, num);
        if (isFound)
        {
            System.out.println("Your number was found.");
        }
        else {
            System.out.println("Your number was not found.");
        }
    }
    public static boolean search(int[][] numArray, int num){
        int i = 0;
        while (i < numArray.length){
            int j = 0;
            while (j < numArray[i].length){
                if (numArray[i][j] == num){
                    return true;
                }
            }
        }


        return false;
    }
}
