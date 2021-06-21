import java.util.Scanner;
import java.util.Stack;

public class p2503_숫자야구 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int answer = 0;

		int n = sc.nextInt();

		int[][] base = new int[n][3];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 3; j++) {
				base[i][j] = sc.nextInt();
			}
		}

		Stack<String> temp = new Stack<String>();

		for (int i = 1; i <= 9; i++)
			for (int j = 1; j <= 9; j++)
				for (int k = 1; k <= 9; k++)
					if (!(i == j || j == k || i == k))
						temp.add("" + i + j + k);

		while (temp.size() > 0) {
			int count = 0;

			for (int i = 0; i < base.length; i++)
				if (base[i][1] == strike(temp.peek(), String.valueOf(base[i][0]))
						&& base[i][2] == ball(temp.peek(), String.valueOf(base[i][0])))
					count++;

			if (count == base.length)
				answer++;

			temp.pop();
		}

		System.out.println(answer);
	}

	public static int strike(String test, String ans) {
		int s = 0;

		for (int i = 0; i < test.length(); i++)
			if (test.charAt(i) == ans.charAt(i))
				s++;

		return s;
	}

	public static int ball(String test, String ans) {
		int b = 0;

		for (int i = 0; i < test.length(); i++) {
			int t = ans.indexOf(String.valueOf(test.charAt(i)));

			if (!(t < 0) && t != i)
				b++;
		}

		return b;
	}
}
