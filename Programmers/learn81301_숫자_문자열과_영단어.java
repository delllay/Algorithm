
public class learn81301_숫자_문자열과_영단어 {
	public static void main(String[] args) {
		System.out.println(solution("one4seveneightzeroone4seveneightzero"));
	}

	public static int solution(String s) {
		String[] numStr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

		for (int i = 0; i < numStr.length; i++) {
			s = s.replace(numStr[i], String.valueOf(i));
		}

		return Integer.parseInt(s);
	}
}
