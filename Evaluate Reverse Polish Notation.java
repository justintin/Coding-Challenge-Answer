public class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens==null||tokens.length==0) return 0;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<tokens.length;i++){
            try{
            int num=Integer.parseInt(tokens[i]);
            stack.push(num);
            }
            catch(Exception e){
                int op2=stack.pop();
                int op1=stack.pop();
                int res=operation(tokens[i],op1,op2);
                stack.push(res);
            }
        }
        return stack.pop();
    }
    private int operation(String operator, int op1,int op2){
        if(operator.equals("+")) return op1+op2;
        else if(operator.equals("-")) return op1-op2;
        else if(operator.equals("*")) return op1*op2;
        else if(operator.equals("/")) return op1/op2;
        else return -1;
    }
}
