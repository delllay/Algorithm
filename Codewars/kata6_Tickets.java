//https://www.codewars.com/kata/555615a77ebc7c2c8a0000b8
public class kata6_Tickets {
	public static void main(String[] args) {
		System.out.println(Tickets(new int[] { 25, 25, 50, 100 }));
		// System.out.println("NO | " + Tickets(new int[] { 25, 100 }));
		// System.out.println("NO | " + Tickets(new int[] { 25, 25, 50, 50, 100 }));
	}

	public static String Tickets(int[] peopleInLine) {
		int[] money = new int[2];

		for (int people : peopleInLine) {
			switch (people) {
			case 25:
				money[0]++;
				break;
			case 50:
				if (money[0] > 0) {
					money[0]--;
					money[1]++;
				} else
					return "NO";
				break;
			case 100:
				if (money[0] > 0 && money[1] > 0) {
					money[0]--;
					money[1]--;
				} else if (money[0] >= 3)
					money[0] -= 3;
				else
					return "NO";
			}
		}
		return "YES";
	}
}
