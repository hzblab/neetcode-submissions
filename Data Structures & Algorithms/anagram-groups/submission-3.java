class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> a = new HashMap<>();
        for (String b: strs){
            char[] c = b.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            a.putIfAbsent(sorted, new ArrayList<>());
            a.get(sorted).add(b);
        }
        return new ArrayList <>(a.values());
        
    }
}
