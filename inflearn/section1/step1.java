
import java.util.*;

public class step1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        int result = 0;

        char[] sep = s1.toLowerCase().toCharArray();

        for (char c : sep) {
            if(s2.toUpperCase().contains(String.valueOf(c))) result ++;
        }

        System.out.print(result);
    }
}