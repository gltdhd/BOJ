package 브론즈5.Day17;

import java.util.Scanner;

public class BOJ9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // 개행문자 소비

        for (int i = 0; i < T; i++) {
            //sc.nextInt()는 정수를 읽고 개행문자(엔터)를 버리지 않기 때문에,
            //sc.nextLine()에서는 개행문자를 읽게 됩니다.
            String str = sc.nextLine();
            int length = str.length();
            System.out.print(str.charAt(0));
            System.out.print(str.charAt(length - 1)+"\n");

        }

    }
}
