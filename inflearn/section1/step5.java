
import java.util.Scanner;

public class step5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        char[] sep = s.toCharArray();

        int startPoint = 0;
        int endPoint = s.length() / 2;
        while (startPoint < endPoint) {
            if (validateAlpha(sep[startPoint]) && validateAlpha(sep[endPoint])) {
                char temp = sep[startPoint];
                sep[startPoint] = sep[endPoint];
                sep[endPoint] = temp;
                startPoint++;
                endPoint--;
            } else if (!validateAlpha(sep[startPoint])) {
                startPoint++; 
            }else if (!validateAlpha(sep[endPoint])) {
                endPoint--;
            }
        }

        String result = String.valueOf(sep);
        System.out.println(result);
    }

    static boolean validateAlpha(char c) {
        if ((65 <= c && c <= 90) || (97 <= c && c <= 122)) {
            return true;
        } else {
            return false;
        }
    }
}
// a#b!GE*T@S
// S#T!EG*b@a
