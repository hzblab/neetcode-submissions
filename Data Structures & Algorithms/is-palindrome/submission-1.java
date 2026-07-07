public class Solution {
    public boolean isPalindrome(String s) {
        String a = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String r = "";

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            r = ch + r;  
        }

        return a.equals(r);
    }
}
