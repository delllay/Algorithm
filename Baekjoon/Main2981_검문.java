package Success;

import java.util.Scanner;

public class Main2981_검문 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (min > arr[i])
				min = arr[i];
		}

		for (int i = 2; i <= min; i++) {
			int temp = arr[0] % i;

			int j = 1;
			while (j != arr.length) {
				if (temp == arr[j] % i)
					j++;
				else
					break;
			}
			
			if(j == arr.length)
				System.out.print(i );
				
		}
		
		sc.close();
	}
}
