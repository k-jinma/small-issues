import java.util.Scanner;

public class Quiz_07_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();
        int n = scan.nextInt();

        // [A] mが奇数の場合、次の偶数に設定
        if (m % 2 == 1) m++;

        int sum = 0;
        // [B] iを2ずつ増やしながらmからnまでの偶数を合計
        for (int i = m; i <= n; i += 2) {
            sum += i;
        }
        System.out.println(sum);
    }
}