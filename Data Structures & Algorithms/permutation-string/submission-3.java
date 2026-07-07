class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;

        int[] s1count = new int[26];
        int[] windcount = new int[26];
        for(char c: s1.toCharArray()){
            s1count[c - 'a']++;

        }

        for(int i=0; i<s2.length(); i++){
            windcount[s2.charAt(i) - 'a']++;

            if(i>=s1.length()){
                windcount[s2.charAt(i - s1.length()) - 'a']--;
            }

            if (Arrays.equals(s1count, windcount)){
                return true;
            }
        }
       return false; 
    }
}
