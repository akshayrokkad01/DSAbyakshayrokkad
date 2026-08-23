class Solution {
    public boolean backspaceCompare(String s, String t) {
        return get(s).equals(get(t));
    }

    private String get(String s) {
        StringBuilder string = new StringBuilder();
        int hashCount = 0;
        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == '#') {
                hashCount++;
                continue;
            }
            if (hashCount > 0) // to skip current character
            {
                hashCount--;
            } else {
                string.append(s.charAt(i));
            }
        }
        return string.toString();
    }
}