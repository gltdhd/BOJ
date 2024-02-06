package 브론즈5.Day16;

import java.math.BigInteger;
import java.util.Scanner;

public class BOJ10757 {
    // 자바에는 말도안되게 큰 수를 다를 수 있는 BigInteger 타입이 있다.
    // BigInteger 는 더할때 함수를 사용한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        System.out.println(a.add(b));
    }
}
