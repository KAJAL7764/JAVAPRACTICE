public class PalindroneArray {
    public static void main(String[] args) {
        System.out.println("This is Array Palindrome checker\n");;
        int[] numArr = ArrayUtility.inputArray();
        boolean isPalin = isPolindrome(numArr);
        if (isPalin){
            System.out.println("Your array is polindrome");
        }
        else {
            System.out.println("your array is not polindrome");
        }
    }



    public static boolean isPolindrome(int[] arr){
        int i = 0;
        while (i < arr.length / 2){
            if (arr[i] != arr[arr.length - 1 - i]){
                return  false;
            }
i++;
        }
        return true;
    }
}

