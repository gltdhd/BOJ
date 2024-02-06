package 브론즈5.Day15;

import java.util.Scanner;

public class BOJ2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = 0;
        for (int i = 1; i <= 5; i++) {
            int a = sc.nextInt();
            val += a*a;
        }
        System.out.println(val % 10);
    }
}
