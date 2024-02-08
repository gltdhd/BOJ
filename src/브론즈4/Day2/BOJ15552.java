package 브론즈4.Day2;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ15552 {
    public static void main(String[] args) throws IOException {

        /* 스캐너는 빠른 입출력이 불가능하다 ㅠㅠ 대신 버퍼드리더/라이터를 사용해야 한다.
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A + B);
        }
        */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            // StringTokenizer 클래스는 문자열을 토큰으로 분리하는 데 사용되는데
            // 문자열을 구분자(기본적으로 공백)에 따라 여러 토큰으로 나눌 때 유용
            // 객체 생성시 구분자를 지정하지 않으면 기본적으로 공백, 탭, 개행 문자, 캐리지 리턴, 폼 피드가 구분자로 사용
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a= Integer.parseInt(st.nextToken());
            int b= Integer.parseInt(st.nextToken());
            //개행을 할 때는 직접 줄바꿈 문자열을 넣어주자
            bw.write(a+b+"\n");
        }
        bw.flush();

    }
}
