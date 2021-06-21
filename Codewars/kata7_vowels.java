public class kata7_vowels {
	public static void main(String[] args) {
		System.out.println(getCount("abracadabra"));
	}

	public static int getCount(String str) {
		return str.replaceAll("(?i)[^aeiou]", "").replaceAll("(?!)[^aeiou]", "").length();
	}
}
