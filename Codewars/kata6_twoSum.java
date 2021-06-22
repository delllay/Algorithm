import java.util.Arrays;

//https://www.codewars.com/kata/52c31f8e6605bcc646000082/train
public class kata6_twoSum {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3 };

		System.out.println(Arrays.toString(twoSum(numbers, 4)));
	}

	public static int[] twoSum(int[] numbers, int target) {
		int[] answer = new int[2];

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] + numbers[j] == target) {
					answer = new int[] { i, j };
				}
			}
		}

		return answer; // Do your magic!
	}
}
