package 브론즈4.Day6;

import java.util.Scanner;

public class BOJ10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] charArray = sc.nextLine().toCharArray();
        //a=97, z==122
        int [] result = new int[26];

        for (int i = 0; i < charArray.length; i++) {
            result[charArray[i]-97]++;
        }

        for (int i : result) {
            System.out.print(i+" ");
        }

    }
}
