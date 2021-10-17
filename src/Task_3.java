import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int tmp = scanner.nextInt();
            if (tmp == 0) break;
            sum += tmp;
        }
        int ans = 0;
        while ((ans + 1) * (ans + 1) <= sum) {
            ans++;
        }
        System.out.println(ans);
    }
}
