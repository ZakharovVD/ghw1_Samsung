import java.util.Scanner;

public class Task_4 {
    public static int[] ans = new int[5];

    public static void upd_ans(int n) {
        for (int i = 0; i < 5; i++) {
            if (n > ans[i]) {
                int k = ans[i];
                ans[i] = n;
                upd_ans(k);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            ans[i] = -2147483647;
        }

        while (true) {
            int tmp = scanner.nextInt();
            if (tmp == 0) break;
            upd_ans(tmp);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
