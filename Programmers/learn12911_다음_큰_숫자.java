public class learn12911_다음_큰_숫자 {
	public int solution(int n) {
		int nOneCount = oneCount3(n);
		int answer = ++n;

		while (oneCount3(answer) != nOneCount)
			answer++;

		return answer;
	}

	// 기본 연산을 이용한 풀이
	private int oneCount1(int n) {
		int count = 0;

		while (n > 0) {
			if (n % 2 == 1)
				count++;
			n /= 2;
		}

		return count;
	}

	// 비트 연산자 이용한 풀이
	private int oneCount2(int n) {
		int count = 0;

		while (n > 0) {
			count += n & 1;
			n = n >> 1;
		}

		return count;
	}

	// Integer.bitCount 이용하기
	private int oneCount3(int n) {
		int count = 0;

		while (n > 0) {
			count += n & 1;
			n = n >> 1;
		}

		return count;
	}

}
