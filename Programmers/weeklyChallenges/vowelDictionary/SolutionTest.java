package weeklyChallenges.vowelDictionary;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
        
        System.out.println("EUUUU | " + solution.solution("EI"));
        System.out.println("AA | " + solution.solution("AA"));
        System.out.println("AAA | " + solution.solution("AAA"));
        
        assertEquals(1, solution.solution("A"));
        assertEquals(2, solution.solution("AA"));
        assertEquals(10, solution.solution("AAAE"));
        assertEquals(1563, solution.solution("I"));
        assertEquals(1189, solution.solution("EIO"));
    }
}
