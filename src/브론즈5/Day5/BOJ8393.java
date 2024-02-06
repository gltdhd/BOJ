package 브론즈5.Day5;

import java.util.Scanner;

public class BOJ8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;

        while(i <= n ){
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
