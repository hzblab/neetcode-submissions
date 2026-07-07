class Solution {

  public String encode(List<String> strs) {
    if (strs.isEmpty()) return "";
    StringBuilder a = new StringBuilder();
    for (String str : strs) {
        a.append(str.length()).append(','); 
    }
    a.append('#');  
    for (String str : strs) {
        a.append(str);  
    }
    return a.toString();
}

    public List<String> decode(String str) {
        if(str.length() == 0) return new ArrayList<>();

        List<String> words = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();

        int i = 0;
        while (str.charAt(i) != '#'){
            StringBuilder e = new StringBuilder();
            while (str.charAt(i) != ','){
                e.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(e.toString()));
            i++;
        }
        i++;

        for (int d: sizes){
            words.add(str.substring(i, i+d));
            i+=d;
        }

        return words;


    }
}
