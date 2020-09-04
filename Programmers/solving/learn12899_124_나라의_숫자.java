package solving;

/*
���� ��ũ : https://programmers.co.kr/learn/courses/30/lessons/12899

[���� ����]
124 ���󿡼��� 1,2,4 ���� �̿��Ͽ� �ڽŵ鸸�� ��Ģ���� ���ڸ� ��Ÿ����. 
1-1 | 2-2 | 3-4 | 4-11 | 5-12 | 6-14 
���� ��Ÿ����.

[�Է�]
���� n

[���]
124 ���󿡼� ǥ���ϴ� ����

[�ؼ�]
���ڸ� 3�� ������ ��Ÿ���� �Ͱ� �⺻������ ����ϴ�.

3�� ���� :	1-1	| 2-2	| 3-10	| 4-11	| 5-12	| 6-20
124 ���� :	1-1	| 2-2	| 3-4	| 4-11	| 5-12	| 6-14

��, 124 ���󿡴� 0�� ���ٴ� ���� �����ؾ��Ѵ�.
3���� ������ �������� ��쿡�� 0 ��� 4�� ��Ÿ����
n�� 1�� ���� ����Ѵ�.

[����]
ù��° Ǯ���� �� ������ ������ ȿ������ ��� Ʋ���� ���Ծ���.
������ �Ƹ� �������� ���ϰ� if ������ Ȯ���ؼ� �׷� �� ����.
ã�ƺ��� if������ Ȯ���ϴ� ��� �̸� 4, 1, 2 ������ �迭�� ����� 3�� ���� �������� ���� ���ϴ� ����� �־� �׷��� �����Ͽ���. 
*/

public class learn12899_124_������_���� {
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
