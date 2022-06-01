class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Stack<Integer> st=new Stack<>();
        
        HashMap<Integer,Integer> mp=new HashMap<>();
        
        for(int ele:nums2)
        {
            while(!st.isEmpty() && st.peek()<ele)
            {
                mp.put(st.pop(),ele);
            }
            
            st.push(ele);
        }
        
        int [] res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            res[i]=mp.getOrDefault(nums1[i],-1);
        }
        
        return res;
        
    }
}