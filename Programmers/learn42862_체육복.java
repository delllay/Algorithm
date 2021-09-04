// https://programmers.co.kr/learn/courses/30/lessons/42862
// https://velog.io/@delay/programmers42862

public class learn42862_체육복 {
    public static void main(String[] args) {

        int n = 9;
        int[] lost = { 2, 4, 7, 8 };
        int[] reserve = { 3, 6, 9 };

        System.out.println(solution(n, lost, reserve));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int[] all = new int[n];

        for (int i : reserve)
            all[i - 1]++;

        for (int i : lost)
            all[i - 1]--;

        for (int i = 0; i < all.length; i++) {
            if (all[i] < 0)
                if (i != all.length - 1 && all[i + 1] > 0) {
                    all[i]++;
                    all[i + 1]--;
                } else if (i != 0 && all[i - 1] > 0) {
                    all[i]++;
                    all[i - 1]--;
                }
        }

        int answer = 0;

        for (int i = 0; i < all.length; i++)
            if (!(all[i] < 0))
                answer++;

        return answer;
    }
}
