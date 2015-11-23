public class Solution {
    public int evalRPN(String[] tokens) {
        if (tokens.length == 0 ){
            return 0;
        }
        Stack<Integer> stack = new Stack<Integer>();
        
        String op = "+-*/";
        for (String token: tokens){
            if (!op.contains(token)) {
                stack.push(Integer.valueOf(token));
                
            }
            else{
                int a = stack.pop();
                int b = stack.pop();
                if (token.equals("+")){
                    stack.push(b + a);
                } else if (token.equals("-")) {
                    stack.push(b - a);
                } else if (token.equals("*")){
                    stack.push(b * a);
                } else if (token.equals("/")) {
                    stack.push(b / a);
                }
            }
            
        }
        return stack.pop();
        
    }
}
