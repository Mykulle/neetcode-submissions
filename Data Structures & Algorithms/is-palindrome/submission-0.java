class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleanStr = new StringBuilder();

        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)){ 
                cleanStr.append(Character.toLowerCase(c));
            }
        }
        String original = cleanStr.toString();
        String reversed = new StringBuilder(original).reverse().toString();

        return original.equals(reversed);
    }
}
