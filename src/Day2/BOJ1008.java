package Day2;

import java.util.Scanner;

public class BOJ1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        System.out.println(A/B);
        // float 과 double 자료형의 정밀도가 다르다
        // float => 소수점 6~7 자리 정도
        // double => 소수점 15~16자리 정도까지 표현 가
        // 코딩테스트에서는 웬만하면 float 보다는 double 자료형을 쓰는게 더 좋다.

    }
}
