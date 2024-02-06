package 브론즈5.Day14;

import java.util.Scanner;

public class BOJ10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] numArr = new int[N];
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            numArr[i] = num;
        }
        int v = sc.nextInt();
        int result = 0;
        for (int j : numArr) {
            if(j == v){
                result++;
            }
        }
        System.out.println(result);
    }
}
