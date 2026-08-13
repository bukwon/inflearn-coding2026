package inflearn.section1.step7;

import java.util.Scanner;

public class step7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        String changeToLowerString = input.toLowerCase();

        char[] c = changeToLowerString.toCharArray();

        int startPoint = 0;
        int endPoint = input.length() - 1;
        boolean result = true;

        while(startPoint < endPoint) {
            if (c[startPoint] != c[endPoint]) {
                result = false;
                break;
            } 
            startPoint ++;
            endPoint --;
        }

        if (result) System.out.print("YES");
        else System.out.print("NO");
    }
}

// gooG
// YES