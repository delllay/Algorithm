package Success;

import java.util.Scanner;
import java.util.Stack;

/*	
[입력]	
주어질 힌트 개수인 n이 입력	
n번만큼 세 자리 숫자와 스트라이크 개수, 볼 개수 입력	
 	
[출력]	
가능한 답의 경우의 수 출력	
	
[해설]	
Stack에 for 문을 통해 123~987까지 각 자리수가 겹치지 않는 세 자리 숫자를 저장	
stack 모든 숫자를 돌면서 주어진 힌트에 만족하는 숫자가 나오면 answer를 증가하는 방식으로 풀이	
주어진 힌트가 만족하는지 확인은 strike, ball 개수를 구하는 함수를 만들어 주어진 힌트와 일치하는 지 확인	
 - strike 함수 : 각 자리를 비교하며 개수 확인	
 - ball 함수  : 주어진 숫자가 답에 있는지 확인하고 strike가 아닌지 확인(두 숫자 자리가 같은지 확인)	
*/

public class Main2503_숫자야구 {
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
