import java.util.Scanner;

// https://www.acmicpc.net/problem/1018

public class p1018_체스판_다시_칠하기 {
	static int[][] okChess1 = { { 1, 0, 1, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0, 1, 0 },
			{ 0, 1, 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1, 0, 1 } };
	static int[][] okChess2 = { { 0, 1, 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1, 0, 1 },
			{ 1, 0, 1, 0, 1, 0, 1, 0 }, { 0, 1, 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0, 1, 0 },
			{ 0, 1, 0, 1, 0, 1, 0, 1 }, { 1, 0, 1, 0, 1, 0, 1, 0 } };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] chess = new int[n][m];

		for (int i = 0; i < chess.length; i++) {
			String s = sc.next();
			for (int j = 0; j < s.split("").length; j++) {
				chess[i][j] = s.split("")[j].equals("W") ? 0 : 1;
			}
		}

		int min = n * m;
		for (int i = 0; i < n - 8; i++) {
			for (int j = 0; j < m - 8; j++) {
				int check = checkChess(chess, i, j);
				min = min < check ? min : check;
			}
		}
		System.out.println(min);
	}

	private static int checkChess(int[][] chess, int markX, int markY) {
		int cnt1 = 0, cnt2 = 0;
		for (int i = markX; i < markX + 7; i++) {
			for (int j = markY; j < markY + 7; j++) {
				int x = (markX + i) % 8;
				int y = (markY + j) % 8;
				if (chess[i][j] != okChess1[x][y])
					cnt1++;
				if (chess[i][j] != okChess2[x][y])
					cnt2++;
			}
		}
		return Math.min(cnt1, cnt2);
	}

}
