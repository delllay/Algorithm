//https://www.codewars.com/kata/563e320cee5dddcf77000158
public class kata8_getAverage {

	public static void main(String[] args) {
		System.out.println(getAverage(new int[] { 2, 2, 2, 2 }));
		System.out.println(getAverage(new int[] { 1, 2, 3, 4, 5 }));
		System.out.println(getAverage(new int[] { 1, 1, 1, 1, 1, 1, 1, 2 }));
	}

	private static int getAverage(int[] marks) {
		int sum = 0;
		for (int mark : marks)
			sum += mark;

		return sum / marks.length;
	}
}
