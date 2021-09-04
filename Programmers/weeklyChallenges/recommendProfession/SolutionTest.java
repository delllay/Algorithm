package weeklyChallenges.recommendProfession;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();

        assertEquals("HARDWARE",
                solution.solution(
                        new String[] { "SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA" },
                        new String[] { "PYTHON", "C++", "SQL" }, 
                        new int[] { 7, 5, 5 }
                        )
                );
        assertEquals("PORTAL",
                solution.solution(
                        new String[] { "SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA" },
                        new String[] { "JAVA", "JAVASCRIPT" }, 
                        new int[] { 7, 5 }
                        )
                );
    }
}
