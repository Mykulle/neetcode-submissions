class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s_chars = s.toCharArray();
        char[] t_chars = t.toCharArray();

        Arrays.sort(s_chars);
        Arrays.sort(t_chars);

        return Arrays.equals(t_chars, s_chars);
    }
}
