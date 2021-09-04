package weeklyChallenges.recommendProfession;

//https://programmers.co.kr/learn/courses/30/lessons/84325
class Solution {
    public String solution(String[] table, String[] languages, int[] preference) {
        String answer = "";
        int max = 0;

        for (int i = 0; i < table.length; i++) {
            int score = getScore(table[i], languages, preference);

            if (score >= max) {
                if (score == max) {
                    answer = (answer.compareTo(table[i].split(" ")[0]) < 0) ? answer : table[i].split(" ")[0];
                } else {
                    answer = table[i].split(" ")[0];
                }
                max = score;
            }
        }

        return answer;
    }

    private int getScore(String str, String[] languages, int[] preference) {
        int score = 0;

        String[] arr = str.split(" ");

        for (int i = 0; i < languages.length; i++) {
            if (str.indexOf(languages[i]) > 0) {
                for (int j = 1; j < arr.length; j++) {
                    if (languages[i].equals(arr[j])) {
                        score += (6 - j) * preference[i];
                    }
                }
            }
        }

        return score;
    }
}