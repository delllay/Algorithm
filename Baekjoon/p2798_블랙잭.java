import java.util.Arrays;
import java.util.Scanner;

// https://velog.io/@delay/acmicpc2798
// https://www.acmicpc.net/problem/2798

public class p2798_블랙잭{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = 0;

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] cards = new int[n];

		for (int i = 0; i < cards.length; i++) {
			cards[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(cards));

		for (int i = 0; i < cards.length - 2; i++) {
			for (int j = i + 1; j < cards.length - 1; j++) {
				for (int k = j + 1; k < cards.length; k++) {
					int sum = cards[i] + cards[j] + cards[k];

					if (sum <= m && sum > max) {
						max = sum;
					}
				}
			}
		}

		System.out.println(max);
	}
}
