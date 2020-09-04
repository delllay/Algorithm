package success;

/*
���� ��ũ : https://programmers.co.kr/learn/courses/30/lessons/42862

[���� ����]
��ü �л� n���� ü�ݼ����� ��ȣ�� ���ĵǾ��ְ�, ü������ �ٷ� �չ�ȣ �Ǵ� �ٷ� �޹�ȣ���Ը� ���� �� �ִ�.
������ ü������ �ִ� �л��� ü������ �Ҿ���ȴٸ� ������ �Դ´�.

[�Է�]
��ü �л� �� n
ü������ �Ҿ���� �л� ��ȣ �迭 lost
�������� ü������ �ִ� �л� ��ȣ �迭 reserve

[���]
�ִ�� ������ ü���� ���� �л��� ��

[�ؼ�]
��ü �л� ���� ������ int �迭�� ����� 
0 : �⺻ ����(ü������ �ְ�, ���� ������ ���� ����)
1 : ������ ü������ �ִ� ����
-1 : ü������ ���� ���� ����
�� üũ�Ͽ� ������ int �迭���� 0 �Ǵ� 1 �� �л��� ���� ���Ѵ�.
	- ü���� ������ �ݺ������� index�� 0 �� ���� �ڽ��� �չ�ȣ�� �����Ƿ� 0���� ���� ���� �� all[i-1]�� üũ�Ѵ�.
	���������� index�� �־��� �л��� ���� ���� ���� �޹�ȣ�� �����Ƿ� and ���� Ȯ�� �� all[i+1]�� üũ�ϵ��� �Ѵ�.
*/

public class learn42862_ü���� {
	public static void main(String[] args) {
		
		int n = 9;
		int[] lost = {2, 4, 7, 8};
		int[] reserve = {3, 6, 9};

		System.out.println(solution(n, lost, reserve));
	}

	public static int solution(int n, int[] lost, int[] reserve) {
		int[] all = new int[n];

		for (int i : reserve)
			all[i - 1]++;

		for (int i : lost)
			all[i - 1]--;

		for (int i = 0; i < all.length; i++)
			if (all[i] < 0)
				if (i != all.length - 1 && all[i + 1] > 0) {
					all[i]++;
					all[i + 1]--;
				} else if (i != 0 && all[i - 1] > 0) {
					all[i]++;
					all[i - 1]--;
				}

		int answer = 0;

		for (int i = 0; i < all.length; i++)
			if (!(all[i] < 0))
				answer++;

		return answer;
	}
}
