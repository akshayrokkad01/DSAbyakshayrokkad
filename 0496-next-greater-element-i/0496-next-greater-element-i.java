class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //to store element and next greatest element
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        //traves from Right -->> left
        for (int i = nums2.length - 1; i >= 0; i--) {
            int element = nums2[i];
            // chech if stack is empty. or not and the peek value must be greater then element
            while (!stack.isEmpty() && stack.peek() <= element) {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                map.put(element,-1);
            }else{
                map.put(element,stack.peek());
            }
            stack.push(element);
        }
        // to get the NGE for nums1
        int[] res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            res[i]=map.get(nums1[i]);
        }
return res;
    }
}