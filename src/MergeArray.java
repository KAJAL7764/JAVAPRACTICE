public class MergeArray {
    public static void main(String[] args) {
        System.out.println("Check array is sorted or not(increasing order)");
        /* approach: two pointer */
int[] numArr1 = ArrayUtility.inputArray();
int[] numArr2 = ArrayUtility.inputArray();
int[] mergedArr = merge(numArr1, numArr2);
        System.out.println("Your merged array is: ");
        ArrayUtility.DisplayArray(mergedArr);
    }

    public  static  int[] merge(int[]arr1, int[] arr2){
int newSize = arr1.length + arr2.length;
int[] newArray = new int[newSize];
int i = 0, j = 0, k = 0;
while (i < arr1.length || j < arr2.length){
    if (j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])){
        newArray[k] = arr1[i];
        i++;
        k++;
    }
    else {
        newArray[k] = arr2[j];
        k++;
        j++;
    }
}
return  newArray;
    }
}
