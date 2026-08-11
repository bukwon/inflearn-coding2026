import java.util.Scanner;

public class step3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String[] sep = s.split(" ");
        String temp = "";

        int n = sep.length;
        for (String check: sep) {
            if (check.length() > temp.length()) {
                temp = check;
            }
        }

        System.out.print(temp);
    }
}


// 문장 중 가장 긴 단어 추출
// it is time to study
// answer: study