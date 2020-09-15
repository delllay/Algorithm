import java.util.Arrays;
import java.util.Comparator;

// https://programmers.co.kr/learn/courses/30/lessons/17686

public class learn17686_파일명_정렬 {

	public static void main(String[] args) {
		String[] files = { "foo0101456bar020.zip", "foo010bar110.zip" };

		String[] answer = solution(files);

		System.out.println(Arrays.toString(answer));

	}

	public static String[] solution(String[] files) {
		Arrays.sort(files, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				String[] file1 = split(s1);
				String[] file2 = split(s2);

				int head = file1[0].toLowerCase().compareTo(file2[0].toLowerCase());

				if (head == 0)
					return Integer.parseInt(file1[1]) - Integer.parseInt(file2[1]);
				else
					return head;
			}
		});
		return files;
	}

	protected static String[] split(String s1) {
		String[] file = new String[3];

		for (int i = 0; i < file.length; i++) {
			file[i] = "";
		}

		int i = 0;

		while (!Character.isDigit(s1.charAt(i))) {
			file[0] += s1.charAt(i++);
		}

		while (i < s1.length() && file[1].length() < 5 && Character.isDigit(s1.charAt(i))) {
			file[1] += s1.charAt(i++);
		}

		file[2] = s1.substring(i);

		return file;
	}
}
