package kata6.camelCase;

class Solution {
    public static String camelCase(String input) {

        return input.replaceAll("([A-Z])", " $1");
    }
}