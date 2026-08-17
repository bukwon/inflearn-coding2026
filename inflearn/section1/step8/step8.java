package inflearn.section1.step8;

import java.util.Scanner;

public class step8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();

        String[] sep = input.split(" ");
        int startPoint = 0;
        int endPoint = sep.length - 1;

        while(startPoint < endPoint) {
            String s1 = sep[startPoint].toLowerCase();
            String s2 = sep[endPoint].toLowerCase();
        }
    }    
}
