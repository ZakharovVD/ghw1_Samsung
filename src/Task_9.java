import java.util.Scanner;

public class Task_9 {
    public static boolean is_palindrome(char[] wort) {
        boolean palindrome = true;
        for(int i = 0; i < (wort.length - wort.length % 2) / 2; i++) {
            if ((wort[i] != wort[(wort.length - i - 1)])) {
                palindrome = false;
                break;
            }
        }
        return palindrome;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] wary = s.toCharArray();
        System.out.println(is_palindrome(wary) ? "Yes" : "No");
    }
}
