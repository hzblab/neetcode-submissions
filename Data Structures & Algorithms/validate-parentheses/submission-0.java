class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for (char a: s.toCharArray()){
            if(a == '(' || a == '[' || a == '{'  ){
            stk.push(a);
        }
        else 
        {
            if(stk.empty())
            {
                return false;
            }

        char top = stk.pop();
        if (a == '}' && top != '{' || a == ']' && top != '[' || a == ')' && top != '(' ){
            return false;
        }
        }  
        }
       return stk.isEmpty();     
    }
}
