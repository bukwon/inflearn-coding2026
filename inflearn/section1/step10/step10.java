import java.util.Scanner;

public class step10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char t = sc.next().charAt(0);

        int[] answer = new int[s.length()];
        int distance = 1000;

        // 왼쪽에 있는 t와의 거리 계산
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) {
                distance = 0;
            } else {
                distance++;
            }

            answer[i] = distance;
        }

        distance = 1000;

        // 오른쪽에 있는 t와의 거리 계산
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == t) {
                distance = 0;
            } else {
                distance++;
            }

            answer[i] = Math.min(answer[i], distance);
        }

        StringBuilder result = new StringBuilder();

        for (int distanceValue : answer) {
            result.append(distanceValue).append(' ');
        }

        System.out.println(result.toString().trim());
    }
}