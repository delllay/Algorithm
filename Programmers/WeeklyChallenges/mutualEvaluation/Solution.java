package weeklyChallenges.mutualEvaluation;

//https://programmers.co.kr/learn/courses/30/lessons/83201
class Solution {
    public String solution(int[][] scores) {
        int[] avgScores = averageScore(scores);

        return grade(avgScores);
    }

    private int[] averageScore(int[][] scores) {
        int[] avgScore = new int[scores.length];

        int avg = 0;
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;

            int min = 101;
            int max = -1;

            for (int j = 0; j < scores.length; j++) {
                int score = scores[j][i];
                if (i != j) {
                    if (score < min)
                        min = score;
                    if (max < score)
                        max = score;
                }
                sum += score;
            }

            if ((scores[i][i] < min) || (max < scores[i][i])) {
                sum -= scores[i][i];
                avg = sum / (scores.length - 1);
            } else {
                avg = sum / scores.length;
            }

            avgScore[i] = avg;
        }

        return avgScore;
    }

    private String grade(int[] avgScores) {
        String answer = "";

        for (int score : avgScores) {
            if (score < 50)
                answer += "F";
            else if (score < 70)
                answer += "D";
            else if (score < 80)
                answer += "C";
            else if (score < 90)
                answer += "B";
            else
                answer += "A";
        }

        return answer;
    }

}