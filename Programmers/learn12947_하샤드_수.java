class learn12947_하샤드_수 {
	public boolean solution(int x) {
		return x % sumOfDigits(x) == 0;
	}

	private int sumOfDigits(int x) {
		int sum = 0;

		while (x > 0) {
			sum += x % 10;
			x /= 10;
		}

		return sum;
	}
}
