class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) return false;

        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = "";
        for (int i =0; i<cleaned.length(); i++) {
            reversed = cleaned.charAt(i) +reversed;
        }
        return cleaned.equals(reversed);
    }
}
