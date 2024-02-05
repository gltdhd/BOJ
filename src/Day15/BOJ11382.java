package Day15;

import java.util.Scanner;

public class BOJ11382 {
    public static void main(String[] args) {
        //int 는 10의 12승까지는 표현할 수 없다!
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        System.out.println(A+B+C);
    }
}
