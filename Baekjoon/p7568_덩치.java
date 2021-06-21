import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// https://velog.io/@delay/acmicpc7568
// https://www.acmicpc.net/problem/7568

public class p7568_덩치 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[][] arr = new int[n][2];

		for (int i = 0; i < arr.length; i++) {
			String s = br.readLine();

			arr[i][0] = Integer.parseInt(s.split(" ")[0]);
			arr[i][1] = Integer.parseInt(s.split(" ")[1]);
		}

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = 0; j < arr.length; j++) {
				if (i != j) {
					if (arr[j][0] > arr[i][0] && arr[j][1] > arr[i][1])
						count++;
				}
			}

			System.out.print(count + " ");
		}

		System.out.println();
	}
}
