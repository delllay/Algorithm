package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class learn42746_가장_큰_수 {
	public static void main(String[] args) {
		int[] numbers = { 8, 998, 999, 4 };

		System.out.println(solution(numbers));
	}

	public static String solution(int[] numbers) {
		String[] arr = new String[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			arr[i] = String.valueOf(numbers[i]);
		}

		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return (s2 + s1).compareTo(s1 + s2);
			}
		});

		String answer = "";

		for (String s : arr) {
			answer += s;
		}
		return !(Integer.parseInt(answer) > 0) ? "0" : answer;
	}
	
	
	
}
