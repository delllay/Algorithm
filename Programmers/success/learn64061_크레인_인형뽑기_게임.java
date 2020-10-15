package programmers;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



/*풀이
1. 보드를 세로 한 줄 씩 스택에 담고 스택들을 list 에 담는다.
2. moves 에 맞는 스택의 top 과 바구니 스택의 top을 비교해서 같으면 pop으로 스택에서 값 제거 아니면 바구니 stack에 값 push



 * */

public class learn64061_크레인_인형뽑기_게임 {
	public static void main(String[] args) {
		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int[] moves = { 1, 5, 3, 5, 1, 2, 1, 4 };

		System.out.println(solution(board, moves));
	}

	public static int solution(int[][] board, int[] moves) {
		int answer = 0;

		List<Stack<Integer>> stackList = new ArrayList<Stack<Integer>>();

		for (int i = 0; i < board.length; i++) {
			Stack<Integer> stack = new Stack<Integer>();

			for (int j = board.length - 1; j >= 0; j--) {
				int temp = board[j][i];
				if (temp != 0)
					stack.push(temp);
			}

			stackList.add(stack);
		}

		Stack<Integer> basket = new Stack<Integer>();

		for (int i : moves) {
			Stack<Integer> stack = stackList.get(i - 1);

			boolean b = true;

			if (!stack.empty()) {
				if (!basket.empty())
					if (stack.peek() == basket.peek()) {
						basket.pop();
						stack.pop();
						b = false;
						answer = answer + 2;
					}
				if (b)
					basket.add(stack.pop());
			}
		}

		return answer;
	}
}
