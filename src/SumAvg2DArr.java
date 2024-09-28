public class SumAvg2DArr {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum and Average of 2D Array:-");
        int[][] numArr = ArrayUtility.input2DArray();
        long sum = sum(numArr);
        double avg = average(numArr);
        System.out.println("Your sum of array is: " + sum);
        System.out.println("Your average of array is: " + avg);
    }
    public static double average(int[][] Arr){
        if (Arr.length == 0){
            return 0;
        }
        int rows = Arr.length;
        int cols = Arr[0].length;
        double size = rows * cols;
        return sum(Arr) / size;

    }
    public static long sum(int[][] Arr){
        long sum = 0;
        int i = 0;
        while (i < Arr.length){
            int j = 0;
            while (j < Arr[i].length){
                sum += Arr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
}
