package Day17;

import java.util.Scanner;

public class BOJ39108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = N / 4;

        for (int i = 1; i <= A; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
