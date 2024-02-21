package 브론즈4.Day6;

import java.util.Scanner;

public class BOJ5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minham = Math.min(sc.nextInt(), Math.min(sc.nextInt(), sc.nextInt()));
        int mincol = Math.min(sc.nextInt(), sc.nextInt());
        System.out.println(mincol+minham-50);

    }
}
