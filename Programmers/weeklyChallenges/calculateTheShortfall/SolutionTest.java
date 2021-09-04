package weeklyChallenges.calculateTheShortfall;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();

        assertEquals(10, solution.solution(3, 20, 4));
        assertEquals(0, solution.solution(3, 4, 1));
        assertEquals(0, solution.solution(3, 18, 3));
    }
}
