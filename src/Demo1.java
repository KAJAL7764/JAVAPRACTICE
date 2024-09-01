public class Demo1 {
    public static void main(String[] args) {
        int a = 12 * 3 - 9 / 2;
        int b = 14 * 4 + 175 / 8;
        if (a++ % 2 == 0) {
            if (b-- % 4 == 0) {
                System.out.println("a = " + a + " b = " + b);
            } else {
                System.out.println("a = " + a + " b = " + b);
            }
        } else {
            System.out.println("a = " + a + " b = " + --b);
        }
    }
}
