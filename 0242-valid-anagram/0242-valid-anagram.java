class Solution {
    public boolean isAnagram(String s, String t) {
        int[] a = new int[250];
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++) {
            a[t.charAt(i)]--;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                return false;
            }
        }
        return true;
    }
}