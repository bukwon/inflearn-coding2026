package step11;

import java.util.Scanner;

public class step11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        char[] sep = input.toCharArray();

        StringBuilder sb = new StringBuilder();
        int count = 1;

        // Set<Character> storage = new HashSet<>();
        char check = '-';

        for (Character c : sep) {
            if (check != c) {
                if (count > 1) {
                    sb.append(count);
                    count = 1;
                }
                sb.append(c);
                check = c;
            } else {
                count ++;
            }
        }

        if (count > 1) {
            sb.append(count);
        }

        System.out.println(sb.toString());
    }
}
// 입력 KKHSSSSSSSE
// 출력 K2HS7E
//ABCA