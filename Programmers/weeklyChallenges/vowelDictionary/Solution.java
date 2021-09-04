package weeklyChallenges.vowelDictionary;

//https://programmers.co.kr/learn/courses/30/lessons/84512
class Solution {
    public int solution(String word) {
        int answer = 0;

        String vowel = "AEIOU";
        int[] level = { 781, 156, 31, 6, 1 };

        for (int i = 0; i < word.length(); i++) {
            int vowelNum = vowel.indexOf(String.valueOf(word.charAt(i)));

            answer += vowelNum * level[i] + 1;
        }
        return answer;
    }
}
