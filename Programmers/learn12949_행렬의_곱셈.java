// https://programmers.co.kr/learn/courses/30/lessons/12949
// https://velog.io/@delay/programmers12949

public class learn12949_행렬의_곱셈 {
	public static void main(String[] args) {
		int[][] arr1 = { { 2, 3, 2 }, { 4, 2, 4 }, { 3, 1, 4 } };
		int[][] arr2 = { { 22, 22, 11 }, { 36, 28, 18 }, { 29, 20, 14 } };

		int[][] s = solution(arr1, arr2);

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[0].length; j++)
				System.out.print("[" + s[i][j] + "]");
			System.out.println();
		}
	}

	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr2[0].length];

		for (int i = 0; i < arr1.length; i++)
			for (int j = 0; j < arr2[0].length; j++)
				for (int n = 0; n < arr1[0].length; n++)
					answer[i][j] += (arr1[i][n] * arr2[n][j]);

		return answer;
	}
}
