package 브론즈4.Day8;

import java.util.Scanner;

public class BOJ10797 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            if (sc.nextInt() == a) {
                sum ++;
            }
        }
        System.out.println(sum
        );
    }
}
