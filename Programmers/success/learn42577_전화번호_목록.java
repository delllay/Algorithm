// https://programmers.co.kr/learn/courses/30/lessons/42577
// https://velog.io/@delay/programmers42577

public class learn42577_전화번호_목록 {
	public static void main(String[] args) {

		String[] phone_book = {"119", "97674223", "1195524421"};

		System.out.println(solution(phone_book));

	}

  public static boolean solution(String[] phone_book) {
    for (int i = 0; i < phone_book.length; i++) {
      for (int j = 0; j < phone_book.length; j++)
        if ((i != j) && phone_book[j].startsWith(phone_book[i])) {
          return false;
        }
    }

    return true;
   }
}
