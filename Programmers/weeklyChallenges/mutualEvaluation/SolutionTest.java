package weeklyChallenges.mutualEvaluation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();

        assertEquals("FBABD", solution.solution(new int[][] { { 100, 90, 98, 88, 65 }, { 50, 45, 99, 85, 77 }, { 47, 88, 95, 80, 67 }, { 61, 57, 100, 80, 65 }, { 24, 90, 94, 75, 65 } }));
//        assertEquals("DA", solution.solution(new int[][] { { 50, 90 }, { 50, 87 } }));
//        assertEquals("CFD", solution.solution(new int[][] { { 70, 49, 90 }, { 68, 50, 38 }, { 73, 31, 100 } }));
//        assertEquals("DDD", solution.solution(new int[][] { { 50, 51, 49 }, { 49, 50, 51 }, { 51, 49, 50 } }));
//        assertEquals("DDDD", solution.solution(new int[][] { { 70, 70, 70, 70 }, { 50, 50, 50, 50 }, { 70, 70, 70, 70 }, { 50, 50, 50, 50 } }));
//    
        }
}
