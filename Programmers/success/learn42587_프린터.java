package programmers;

import java.util.*;

public class learn42587_«¡∏∞≈Õ {
	public static void main(String[] args) {
		int[] priorities = { 1, 1, 9, 1, 1, 1 };

		System.out.println(solution2(priorities, 0));
	}

	public static int solution(int[] priorities, int location) {

		Queue<File> fileQueue = new LinkedList<File>();
		Stack<File> printStack = new Stack<File>();

		for (int i = 0; i < priorities.length; i++)
			fileQueue.add(new File(i, priorities[i]));

		while (!fileQueue.isEmpty()) {
			File file = fileQueue.peek();

			int max = Collections.max(fileQueue).priority;

			if (max == file.priority)
				printStack.add(fileQueue.poll());
			else if (max > file.priority)
				fileQueue.add(fileQueue.poll());
		}

		int answer = 1;
		for (File f : printStack) {
			if (f.index == location)
				return answer;

			answer++;
		}

		return answer;
	}

	public static int solution2(int[] priorities, int location) {
		int answer = 0;
		int l = location;

		Queue<Integer> que = new LinkedList<Integer>();
		for (int i : priorities) {
			que.add(i);
		}

		Arrays.sort(priorities);
		int size = priorities.length - 1;

		while (!que.isEmpty()) {
			int i = que.poll();
			int cnt = priorities[size - answer];
			if (i == cnt) {
				answer++;
				l--;
				if (l < 0)
					break;
			} else {
				que.add(i);
				l--;
				if (l < 0)
					l = que.size() - 1;
			}
		}

		return answer;
	}
}

class File implements Comparable<File> {

	int index;
	int priority;

	public File(int index, int priority) {
		this.index = index;
		this.priority = priority;
	}

	@Override
	public int compareTo(File target) {
		if (this.priority < target.priority)
			return -1;
		else
			return 1;
	}
}