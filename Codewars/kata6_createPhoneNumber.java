
public class kata6_createPhoneNumber {
    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 }));
    }

    public static String createPhoneNumber(int[] numbers) {
        String answer = "";

        for (int i = 0; i < numbers.length; i++) {
            switch (i) {
            case 0:
                answer += "(";
                break;
            case 3:
                answer += ") ";
                break;
            case 6:
                answer += "-";
                break;
            }
            answer += numbers[i];
        }
        return answer;
    }
}
