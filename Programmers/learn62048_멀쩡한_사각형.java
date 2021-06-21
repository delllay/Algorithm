// https://programmers.co.kr/learn/courses/30/lessons/62048
// https://velog.io/@delay/programmers62048

public class learn42626_?_留듦? {
	public static void main(String[] args) {
		System.out.println(solution(8, 12));
	}

	public static long solution(int w, int h) {
   	 	long answer = 0;

		for (long i = 1; i < w; i++)
		answer += i * h / w;

		return answer * 2;
	}
}
