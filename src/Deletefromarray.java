import java.util.Scanner;

public class Deletefromarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array deletion\n");
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("Enter your specific num that you want to delete from array:");
        int numToDelete = input.nextByte();
        int[] newArr = deleteNumber(numArr, numToDelete);
        System.out.println("Here is your new Array");
        ArrayUtility.DisplayArray(newArr);
    }
    public static int[] deleteNumber(int[] numArr, int NumToDelete){
int occ = OccurenceArray.noOfOccurrences(numArr, NumToDelete );
    if (occ== 0){
        return numArr;
    }
    int newSize = numArr.length - occ;
    int[] newArr = new int[newSize];

    int i = 0, j = 0;
    while (i < numArr.length){
        if (numArr[i] != NumToDelete){
            newArr[j] = newArr[i];
            j++;
        }
      i++;
    }
        return newArr;
    }

}
