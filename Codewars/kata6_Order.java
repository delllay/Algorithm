import java.util.Arrays;
import java.util.Comparator;

//https://www.codewars.com/kata/55c45be3b2079eccff00010f
public class kata6_Order {
	public static void main(String[] args) {
		System.out
				.println(order("is2 Thi1s T4est 3a") + "|" + order("is2 Thi1s T4est 3a").equals("Thi1s is2 3a T4est"));
		System.out.println(order("4of Fo1r pe6ople g3ood th5e the2") + "|"
				+ order("4of Fo1r pe6ople g3ood th5e the2").equals("Fo1r the2 g3ood 4of th5e pe6ople"));
		System.out.println(order("") + "|" + order("").equals(""));

	}

	public static String order(String words) {
		String[] wordArr = words.split(" ");

		Arrays.sort(wordArr, new Comparator<String>() {

			public int compare(String o1, String o2) {
				return Integer.parseInt(o1.replaceAll("[a-zA-Z]", ""))
						- Integer.parseInt(o2.replaceAll("[a-zA-Z]", ""));
			}
		});

		String answer = "";

		for (String word : wordArr)
			answer += word + " ";

		return answer.substring(0, answer.length() - 1);
	}
}
