public class IsSortedArray {
    public static void main(String[] args) {
        System.out.println("Check array is sorted or not");
        int[] numArr = ArrayUtility.inputArray();
        boolean inc = isIncreasing(numArr);
        boolean dec = isDecreasing(numArr);
        if (inc || dec){
            System.out.println("Array is sorted");
        }
        else {
            System.out.println("Array is not sorted");
        }
    }

    public static boolean isIncreasing(int[] numArray) {

        int i =  1;
        while (i < numArray.length){
            if (numArray[i] < numArray[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasing(int[] numArray) {
        int i =  1;
        while (i < numArray.length){
            if (numArray[i] > numArray[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}