import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int min = 2000000000;
        int max = -2000000000;
        int sum = 0;

        for(int i = 0; i < n; i++) {
            int tmp = scanner.nextInt();
            if(tmp < min) min = tmp;
            if(tmp > max) max = tmp;
            sum += tmp;
        }

        System.out.println(max);
        System.out.println(min);
        System.out.println(1.0 * sum / n);
    }
}
