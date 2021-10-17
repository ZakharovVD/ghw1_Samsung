import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int ans = 0;
        for(int i = 0; i < n; i++) {
            int tmp = scanner.nextInt();
            while (tmp > 9) tmp /= 10;
            ans = ans * 10 + tmp;
        }
        System.out.println(ans);
    }
}
