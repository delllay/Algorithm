import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://velog.io/@delay/acmicpc2231
// https://www.acmicpc.net/problem/2231

public class p2231_분해합 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int i = n - String.valueOf(n).length() * 9;

		while (bunhae(i) != n && i < n) {
			i++;
		}

		System.out.println(i != n ? i : 0);

	}

	public static int bunhae(int n) {
		int sum = n;
		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}

		return sum;
	}
}
