package 브론즈4.Day7;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {sc.nextInt(), sc.nextInt(), sc.nextInt()};

        Arrays.sort(array);
        for (int i : array) {
            System.out.print(i+" ");
        }

        }
}
