import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://programmers.co.kr/learn/courses/30/lessons/68644
// https://velog.io/@delay/programmers68644

public class learn68644_?_媛_戮??_??湲?{
	public static void main(String[] args) {
		int[] numbers = {5,0,2,7};

		System.out.println(Arrays.toString(solution(numbers)));
	}

	static public int[] solution(int[] numbers) {

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				int c = numbers[i] + numbers[j];
				if (list.indexOf(c) < 0)
					list.add(c);
			}
		}

		int[] answer = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		Arrays.sort(answer);
		
		return answer;
	}
}
