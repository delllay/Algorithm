
// https://programmers.co.kr/learn/courses/30/lessons/42578
// https://velog.io/@delay/programmers42578

import java.util.HashMap;

public class learn42578_위장 {
	public static void main(String[] args) {
		String[][] clothes = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
				{ "green_turban", "headgear" } };

		System.out.print(solution(clothes));

	}

	public static int solution(String[][] clothes) {
		HashMap<String, Integer> closet = new HashMap<String, Integer>();

		for (int i = 0; i < clothes.length; i++) {
			closet.put(clothes[i][1], closet.getOrDefault(clothes[i][1], 0) + 1);
		}

		int answer = 1;

		for (int c : closet.values())
			answer *= (c + 1);

		return answer - 1;
	}
}
