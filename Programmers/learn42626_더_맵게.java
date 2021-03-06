﻿import java.util.PriorityQueue;

//https://programmers.co.kr/learn/courses/30/lessons/42626
// https://velog.io/@delay/programmers42626

public class learn42626_더_맵게 {
	public static void main(String[] args) {

		int[] scoville = { 1, 2, 3 };
		int K = 11;

		System.out.println(solution(scoville, 7));
	}

	public static int solution(int[] scoville, int K) {
		int answer = 0;

		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		for (int s : scoville)
			queue.offer(s);

		while (queue.size() > 1 && queue.peek() <= K) {
			queue.offer(queue.poll() + queue.poll() * 2);
			answer++;
		}

		return queue.peek() > K ? answer : -1;
	}
}
