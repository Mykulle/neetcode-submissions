class Solution {
    public boolean isPalindrome(String s) {
         int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            char l = s.charAt(left);
            char r = s.charAt(right);
            
            // Nếu con trỏ trái gặp ký tự đặc biệt, dịch sang phải
            if (!Character.isLetterOrDigit(l)) {
                left++;
            } 
            // Nếu con trỏ phải gặp ký tự đặc biệt, dịch sang trái
            else if (!Character.isLetterOrDigit(r)) {
                right--;
            } 
            // Cả hai đều là chữ/số thì tiến hành so sánh
            else {
                if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                    return false;
                }
                left++;
                right--;
            }
        }
        
        return true;
    }
}
