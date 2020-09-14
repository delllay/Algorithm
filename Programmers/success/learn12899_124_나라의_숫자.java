// https://programmers.co.kr/learn/courses/30/lessons/12899
// https://velog.io/@delay/JAVA-더-맵게-124-나라의-숫자

public class learn12899_124_나라의_숫자 {
	public static void main(String[] args) {

		int n = 18;

		System.out.println(solution(n));

	}

	public static String solution(int n) {
		String answer = "";
		int r = 0;
		while (n > 0) {
			r = n % 3;

			n /= 3;

			if (r == 0) {
				n--;
				r = 4;
			}

			answer = r + answer;
		}

		return answer;
	}

	public static String solution2(int n) {
		String[] num = {"4", "1", "2"};
		String answer = "";

		while (n > 0) {
			answer = num[n % 3] + answer;
			n = (n - 1) / 3;
		}

		return answer;
	}

}
