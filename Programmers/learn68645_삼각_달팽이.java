import java.util.Arrays;

// https://programmers.co.kr/learn/courses/30/lessons/68645
// https://velog.io/@delay/programmers68645

public class learn68645_?쇨?_?ы쎌?{
	public static void main(String[] args) {
		System.out.println(Arrays.toString(solution(6)));
		System.out.println("[1, 2, 15, 3, 16, 14, 4, 17, 21, 13, 5, 18, 19, 20, 12, 6, 7, 8, 9, 10, 11]");
	}

	public static int[] solution(int n) {
		int[][] arr = new int[n][n];

		int max = getMax(n);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				arr[i][j] = -1;
			}
		}

		int[] answer = new int[max];

		int i = 0, j = 0, k = 1;

		arr[i][j] = k;

		while (k < max) {
			while (i + 1 < n && k < max && arr[i + 1][j] < 0) {
				arr[++i][j] = ++k;
			}

			while (j + 1 < n && k < max && arr[i][j + 1] < 0) {
				arr[i][++j] = ++k;
			}

			while (i - 1 > 0 && i - 1 > 0 && k < max && arr[i - 1][j - 1] < 0) {
				arr[--i][--j] = ++k;
			}
		}

		k = 0;

		for (i = 0; i < n; i++) {
			for (j = 0; j <= i; j++) {
				answer[k++] = arr[i][j];
			}
		}
		return answer;
	}

	static int getMax(int n) {
		return n == 1 ? 1 : getMax(n - 1) + n;
	}
}
