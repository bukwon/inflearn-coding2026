import java.util.Scanner;

public class step2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        char[] c = s.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (char temp : c) {
            if (temp >= 97 && temp <= 122) {
                sb.append(String.valueOf(temp).toUpperCase());
            } else {
                sb.append(String.valueOf(temp).toLowerCase());
            }
        }

        System.out.print(sb.toString());
    }
}

// 예제 입력 
// StuDY
// 예제 출력 
// sTUdy