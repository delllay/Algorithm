import java.util.Arrays;

public class learn77484_로또의_최고_순위와_최저_순위 {
	public static void main(String[] args) {
		int[] lottos = { 0, 0, 0, 0, 0, 0 };
		int[] win_nums = { 38, 19, 20, 40, 15, 25 };

		System.out.println(Arrays.toString(solution(lottos, win_nums)));
	}

	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = { 7, 7 };

		int zero = 0;

		for (int i = 0; i < lottos.length; i++) {
			if (lottos[i] == 0)
				zero++;

			for (int j = 0; j < win_nums.length; j++) {
				if (lottos[i] == win_nums[j]) {
					answer[0]--;
					answer[1]--;
				}
			}
		}

		answer[0] -= zero;
		

		return answer;
	}
}
