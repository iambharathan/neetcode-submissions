class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> num = new Stack<>();
        for(String c : tokens){
            if(c.equals("+")){
                num.push(num.pop()+num.pop());
            }   else if(c.equals("-")){
                int a = num.pop();
                int b = num.pop();
                num.push(b-a);
            }   else if(c.equals("*")){
                num.push(num.pop() * num.pop());
            }   else if(c.equals("/")){
                int a = num.pop();
                int b = num.pop();
                num.push(b/a);
            } else{
                num.push(Integer.parseInt(c));
            }
        }
        return num.pop();
    }
}
