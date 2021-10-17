import java.util.Scanner;

public class Task_10 {
    public static boolean bit(int n, int i) {
        return (n & (1 << i)) > 0;
    }

    // bit1 == bit2 == 0, next == 0 => next = 0, bit = 0 [1]
    // bit1 == bit2 == 0, next == 1 => next = 0, bit = 1 [1]

    // bit1 == bit2 == 1, next == 0 => next = 1, bit = 0 [2]
    // bit1 == bit2 == 1, next == 1 => next = 1, bit = 1 [2]

    // bit1 == 1, bit2 == 0, next == 0 => next = 0, bit = 1
    // bit1 == 0, bit2 == 1, next == 0 => next = 0, bit = 1

    // bit1 == 1, bit2 == 0, next == 1 => next = 1, bit = 0
    // bit1 == 0, bit2 == 1, next == 1 => next = 1, bit = 0

    public static int solve(int a, int b) {
        int next = 0, ans = 0;
        for (int i = 0; i < 31; i++) {
            if (!bit(a, i) && !bit(b, i)) {
                ans = ans ^ (next << i);
                next = 0;
            }
            if (bit(a, i) && bit(b, i)) {
                ans = ans ^ (next << i);
                next = 1;
            }
            if ((bit(a, i) ^ bit(b, i)) && next == 0) {
                ans = ans ^ (1 << i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(solve(a, b));
    }
}
