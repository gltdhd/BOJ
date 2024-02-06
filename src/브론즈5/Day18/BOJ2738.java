package 브론즈5.Day18;

import java.util.Scanner;

public class BOJ2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        sc.nextLine();

        int scale = 2*N*M;
        int[] A = new int[scale];

        for (int i = 0; i < scale; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < scale/2; i++) {
            System.out.print(A[i]+A[i+(N*M)]+" ");
            if ((i!=0)&&((i+1) % M == 0)) {
                System.out.println();
            }
        }
    }

}
