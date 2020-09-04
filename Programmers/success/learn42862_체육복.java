package success;

/*
문제 링크 : https://programmers.co.kr/learn/courses/30/lessons/42862

[문제 설명]
전체 학생 n명은 체격순으로 번호가 정렬되어있고, 체육복은 바로 앞번호 또는 바로 뒷번호에게만 빌릴 수 있다.
여분의 체육복이 있는 학생이 체육복을 잃어버렸다면 본인이 입는다.

[입력]
전체 학생 수 n
체육복을 잃어버린 학생 번호 배열 lost
여유분의 체육복이 있는 학생 번호 배열 reserve

[출력]
최대로 가능한 체육복 입은 학생의 수

[해설]
전체 학생 수와 동일한 int 배열을 만들고 
0 : 기본 상태(체육복이 있고, 도난 당하지 않은 상태)
1 : 여부의 체육복이 있는 상태
-1 : 체육복을 도난 당한 상태
로 체크하여 마지막 int 배열에서 0 또는 1 인 학생의 수를 구한다.
	- 체육복 나누는 반복문에서 index가 0 일 때는 자신의 앞번호가 없으므로 0보다 작지 않을 때 all[i-1]을 체크한다.
	마찬가지로 index가 주어진 학생의 수과 같을 때는 뒷번호가 없으므로 and 문을 확인 후 all[i+1]를 체크하도록 한다.
*/

public class learn42862_체육복 {
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
