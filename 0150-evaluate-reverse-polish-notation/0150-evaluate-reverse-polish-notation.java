class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String t : tokens) {
            if (!"*/+-".contains(t)) {
                stack.push(Integer.valueOf(t));
                continue;
            }
            int num2 = stack.pop();
            int num1 = stack.pop();
            stack.push(calsi(t, num1,num2));
        }
        return stack.pop();
    }

    private int calsi(String t,int num1,int num2)
    {
        int res=0;
        switch(t){
            case"*":res=num1*num2;
            break;
              case"-":res=num1-num2;
            break;
              case"/":res=num1/num2;
            break;
              case"+":res=num1+num2;
            break;
            default: break;
        }
        return res;
    }
}