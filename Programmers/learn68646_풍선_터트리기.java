// https://programmers.co.kr/learn/courses/30/lessons/68646
// https://velog.io/@delay/programmers68646

public class learn68646_풍선_터트리기 {
	public static void main(String[] args) {
		int[] a = { -16, 27, 65, -2, 58, -92, -71, -68, -61, -33 };

		System.out.println(solution(a));
	}

	public static int solution(int[] a) {
		int answer = 0;

		int l = 1000000000, r = 1000000000;

		for (int i = 0; i < a.length; i++) {
			if (a[i] < l) {
				answer++;
				l = a[i];
			}

			if (a[a.length - 1 - i] < r) {
				answer++;
				r = a[a.length - 1 - i];
			}

			if (l == r)
				break;
		}

		return answer + (l == r ? -1 : 0);
	}
}
