package step9;

import java.util.Scanner;

public class Step9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] sep = s.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (char c : sep) {
            if (c - '0' >= 0 && c - '0' <= 9) {
                sb.append(c);
            }
        }

        System.out.print(Integer.valueOf(sb.toString()));
    }
}
// 입력 g0en2T0s8eSoft
// 출력 208