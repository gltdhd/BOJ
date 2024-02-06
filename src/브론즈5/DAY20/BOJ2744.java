package 브론즈5.DAY20;

import java.util.Scanner;

public class BOJ2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chr = sc.nextLine().toCharArray();

        for (int i = 0; i < chr.length; i++) {
            char temp = chr[i];
            if (temp >= 'a' && temp <= 'z') {
                System.out.print((char)(temp-32));
            } else {
                System.out.print((char)(temp+32));

            }
        }
    }
}
