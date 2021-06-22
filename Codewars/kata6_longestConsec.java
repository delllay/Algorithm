import java.util.Arrays;
import java.util.Comparator;

public class kata6_longestConsec {
	public static void main(String[] args) {
		String[] str = { "zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail", "ejjjjmmtthh",
				"zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh" };
		String ans = longestConsec(str, 3);
		System.out.println(ans + " | " + "abigailtheta".equals(ans));
	}

	public static String longestConsec(String[] strarr, int k) {
		System.out.println(Arrays.toString(strarr));

		for (int i = 0; i < strarr.length - 1; i++) {
			for (int j = i + 1; j < strarr.length; j++) {
				if (strarr[i] == strarr[j])
					strarr[j] = "";
			}
		}

		Arrays.sort(strarr, new Comparator<String>() {
			public int compare(String o1, String o2) {
				return o2.length() - o1.length();
			}
		});

		System.out.println(Arrays.toString(strarr));

		String ans = "";

		for (int i = 0; i < k; i++) {
			ans += strarr[i];
		}

		return ans;
	}
}
