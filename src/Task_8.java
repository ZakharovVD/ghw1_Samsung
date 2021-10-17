import java.util.Scanner;

public class Task_8 {
    public static void solve(int n) {
        int pos = 0;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                pos = i;
                break;
            }
        }
        if (pos == 0) {
            System.out.print(n);
        }
        else {
            System.out.print(pos + "*");
            solve(n / pos);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        solve(n);
    }
}
