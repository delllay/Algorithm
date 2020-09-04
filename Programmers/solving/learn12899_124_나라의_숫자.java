package solving;

/*
문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/12899

[문제 설명]
124 나라에서는 1,2,4 만을 이용하여 자신들만의 규칙으로 숫자를 나타낸다. 
1-1 | 2-2 | 3-4 | 4-11 | 5-12 | 6-14 
같이 나타낸다.

[입력]
숫자 n

[출력]
124 나라에서 표현하는 숫자

[해설]
숫자를 3의 진수로 나타내는 것과 기본적으로 비슷하다.

3의 진수 :	1-1	| 2-2	| 3-10	| 4-11	| 5-12	| 6-20
124 나라 :	1-1	| 2-2	| 3-4	| 4-11	| 5-12	| 6-14

단, 124 나라에는 0이 없다는 것을 주의해야한다.
3으로 나누어 떨어지는 경우에는 0 대신 4를 나타내고
n은 1을 빼서 계산한다.

[참고]
첫번째 풀었을 때 정답은 맞으나 효율성이 계속 틀리게 나왔었다.
이유는 아마 나머지를 구하고 if 문으로 확인해서 그런 거 같다.
찾아보니 if문으로 확인하는 대신 미리 4, 1, 2 순으로 배열을 만들고 3을 나눈 나머지로 값을 구하는 방법이 있어 그렇게 구현하였다. 
*/

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
