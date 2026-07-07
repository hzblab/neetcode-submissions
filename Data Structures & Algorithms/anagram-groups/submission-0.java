class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();
        for (String s : strs ){
            char[] ssort = s.toCharArray();
            Arrays.sort(ssort);
            String xsort = new String(ssort);
            res.putIfAbsent(xsort, new ArrayList<>());
            res.get(xsort).add(s);
        }

        return new ArrayList<>(res.values());  
    }
}
