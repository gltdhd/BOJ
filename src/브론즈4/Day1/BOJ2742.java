package 브론즈4.Day1;

import java.util.Scanner;

public class BOJ2742 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (true) {
            if (N == 0) {
                break;
            }
            System.out.println(N);
            N--;
        }
    }
}
