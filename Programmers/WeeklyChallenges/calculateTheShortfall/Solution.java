package WeeklyChallenges.calculateTheShortfall;

//https://programmers.co.kr/learn/courses/30/lessons/82612
class Solution {
    public long solution(int price, int money, int count) {
        long answer = money;

        for (int i = 1; i <= count; i++) {
            answer -= price * i;
        }

        return answer < 0 ? answer * -1 : 0;
    }
}