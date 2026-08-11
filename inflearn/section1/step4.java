import java.util.Scanner;

public class step4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] result = new String[n];
        
        for (int i = 0; i < n; i++) {
            String s = in.next();
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            result[i] = String.valueOf(sb);
        }

        for (String tmp:result) {
            System.out.println(tmp);
        }
    }
}