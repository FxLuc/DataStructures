package DataStructures.RecursionFinbonaci;

public class Main {
    public static void main(String[] args) {
        int value = 10;
        for (int i = 0; i < value; i++) {
            System.out.print(fibonaci(i) + " ");
        }

        // Output:
        // 0 1 1 2 3 5 8 13 21 34
    }

    private static int fibonaci(int number) {
        if (number < 2) return number;
        return fibonaci(number - 1) + fibonaci(number - 2);
    }
}
