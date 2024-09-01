import java.util.Scanner;

public class maxAndMin {
    public static void main(String[] args) {
        System.out.println("This is program will found min and max array");

//        System.out.println("Take input from users");
        int[] numArr = ArrayUtility.inputArray();
        int min = max(numArr);
        int max = min(numArr);
        System.out.println("Max of the Array is: " + max);
        System.out.println("Min of the Array is: " + min);
    }


    public static int min(int[] numArr){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < numArr.length){
            if (min > numArr[i]){
              min =  numArr[i];
            }
            i++;
        }

        return min;
    }


    public static int max(int[] numArr){
        if (numArr.length == 0){
            return Integer.MIN_VALUE;
        }
        int max = numArr[0];
        int i = 0;
        while (i < numArr.length){
            if (max < numArr[i]){
                max = numArr[i];
            }
        }
        return max;
    }
}
