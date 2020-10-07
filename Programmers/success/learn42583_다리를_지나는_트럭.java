import java.util.LinkedList;
import java.util.Queue;

public class learn42583_다리를_지나는_트럭 {

	public static void main(String[] args) {
		int bridge_length = 100;
		int weight = 100;
		int[] truck_weights = { 10 };

		System.out.println(solution(bridge_length, weight, truck_weights));
	}

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		Queue<Integer> wating = new LinkedList<Integer>();
		int[] bridgeArr = new int[bridge_length];

		for (int i = 0; i < truck_weights.length; i++) {
			wating.add(truck_weights[i]);
		}

		int bridgeWeight = 0;
		int answer = 0;

		while (!wating.isEmpty()) {
			if (answer == 110)
				System.out.println(5);
			answer++;
			bridgeWeight -= bridgeArr[bridge_length - 1];

			for (int i = bridgeArr.length - 1; i > 0; i--) {
				bridgeArr[i] = bridgeArr[i - 1];
			}

			bridgeArr[0] = 0;

			if (weight - bridgeWeight >= wating.peek() && bridgeArr[0] == 0) {
				bridgeArr[0] = wating.poll();
				bridgeWeight += bridgeArr[0];
			}

		}

		return answer + bridge_length;
	}
}
