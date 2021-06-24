//https://programmers.co.kr/learn/courses/30/lessons/77884
public class learn77884_약수의_개수와_덧셈 {
	public static void main(String[] args) {
		System.out.println(solution(1, 1));

	}

	public static int solution(int left, int right) {
		int ans = 0;

		for (int i = left; i <= right; i++) {
			if (isEvenFac(i))
				ans += i;
			else
				ans -= i;
		}

		return ans;
	}

	private static boolean isEvenFac(int num) {
		int fac = 2;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				fac++;
		}
		return num > 1 && fac % 2 == 0;
	}

}
