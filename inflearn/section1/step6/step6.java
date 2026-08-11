package inflearn.section1.step6;

import java.util.Scanner;

public class step6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        char[] sep = s.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (char c : sep) {
            if (sb.toString().contains(String.valueOf(c)))
                continue;
            sb.append(c);
        }

        System.out.println(sb.toString());
    }
}
