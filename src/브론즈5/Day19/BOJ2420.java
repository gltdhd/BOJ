package 브론즈5.Day19;

import java.util.Scanner;

public class BOJ2420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        long result = N - M;
        if (result < 0) {
            result = -result;
        }
        System.out.println(result);
    }
}
