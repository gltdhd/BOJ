package 브론즈5.DAY20;

import java.util.Scanner;

public class BOJ4101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (A > B) {
                System.out.println("Yes");
            } else if ((A==0)&&(B==0)) {
                break;
            } else {
                System.out.println("No");
            }
        }
    }
}
