﻿import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/42586
// https://velog.io/@delay/programmers42586

public class learn42586_기능개발 {
	public static void main(String[] args) {

		int[] progresses = { 93, 30, 55 };
		int[] speeds = { 1, 30, 5 };

		System.out.println(Arrays.toString(solution(progresses, speeds)));
	}

	public static int[] solution(int[] progresses, int[] speeds) {
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = progresses.length - 1; i >= 0; i--)
			stack.add((100 - progresses[i]) / speeds[i] + ((100 - progresses[i]) % speeds[i] > 0 ? 1 : 0));

		List<Integer> s = new ArrayList<Integer>();

		while (!stack.isEmpty()) {
			int cnt = 1;

			int top = stack.pop();

			while (!stack.isEmpty() && stack.peek() <= top) {
				cnt++;
				stack.pop();
			}

			s.add(cnt);
		}

		int[] answer = new int[s.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = s.get(i);
		}

		return answer;
	}
}
