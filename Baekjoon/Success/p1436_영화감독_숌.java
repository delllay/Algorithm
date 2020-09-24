import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1436
// https://velog.io/@delay/acmicpc1436

public class p1436_영화감독_숌 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int cnt = 0;
		int n = 665;
		while (N > cnt) {
			n++;
			if (check(n))
				cnt++;
		}

		System.out.println(n);
	}

	public static boolean check(int n) {
		int cnt = 0;

		while (n > 0 && cnt < 3) {
			if (n % 10 == 6)
				cnt++;
			else
				cnt = 0;
			n /= 10;
		}

		return cnt >= 3;
	}
}
