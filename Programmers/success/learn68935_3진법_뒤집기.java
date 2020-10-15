package programmers;

public class learn68935_3진법_뒤집기 {
	public static void main(String[] args) {
		System.out.println("[" + solution(45) + "]");
		System.out.println("[" + solution(125) + "]");
	}

	public static int solution(int n) {
		System.out.println(Integer.toString(n, 3));

		int answer = 0;
		String s = Integer.toString(n, 3);

		for (int i = 0; i < s.length(); i++) {
			answer += (s.charAt(i) - '0') % 3 * Math.pow(3, i);
		}

		return answer;
	}
}
