class Solution {
    public int evalRPN(String[] tokens) {
       if (tokens.length == 0) return 0;

       Stack <Integer> nums = new Stack<>();
       for (String t : tokens){
        if (t.equals("+") || t.equals("-") || t.equals("*") ||t.equals("/") ){
            int right = nums.pop();
            int left = nums.pop();
            int result = 0;

            switch(t){
                case "+": result = left + right; break;
                case "-": result = left - right; break;
                case "*": result = left * right; break;
                case "/": result = left / right; break;
            }
            nums.push(result);
        }
        else {
            nums.push(Integer.parseInt(t));
        }
       } 
        return nums.pop();
    }
}
