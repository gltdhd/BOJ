import java.util.Scanner;

public class BOJ11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String numArr = sc.nextLine();
        int[] numArr2 = new int[numArr.length()];
        int result = 0;

        for (int i = 0; i < numArr2.length; i++) {
            int temp = numArr.charAt(i);
            result += temp;
        }
        System.out.println(result);
    }
}
