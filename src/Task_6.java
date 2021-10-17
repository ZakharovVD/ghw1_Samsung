import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int ans = 0;
        for (int i = 0; i < n; i++) {
            int tmp = scanner.nextInt();
            if (tmp % 100 == 11 && tmp > ans) {
                ans = tmp;
            }
        }
        System.out.println(ans);
    }
}
