class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int n = temperatures.length;
        int[] answer = new int[n]; // [0,0,0,0,0,0]
        for (int i = n - 1; i >= 0; i--)// rigth to left.   left <<<<---- right
        {
            while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) 
            {
                stack.pop(); // if it is >=stack.peek() we pop then it will be zero
            }
            if (!stack.isEmpty()) {
                answer[i] = stack.peek() - i; // i wil get stored in ans[] === [0,0,0,1,0,0] it will get updated to that current index
            }


            stack.push(i); // if satck isEmpty will push current index

        }
        return answer;
    }
}