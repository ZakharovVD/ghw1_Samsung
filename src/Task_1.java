import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 1;
        while ((ans + 1) * (ans + 1) <= n) {
            ans++;
        }
        System.out.println(ans);
    }
}
