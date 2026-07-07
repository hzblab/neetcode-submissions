class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] res = s1.toCharArray();
        Arrays.sort(res);
        String rex = new String(res);

        for(int i=0; i<s2.length(); i++){
            for (int j=i; j<s2.length(); j++){
                char[] red = s2.substring(i, j+1).toCharArray();
                Arrays.sort(red);
                String ref = new String(red);

                if(ref.equals(rex)){
                return true;
            }
            }   
        }
        return false;  
    }
}
