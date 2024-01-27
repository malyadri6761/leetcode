class Solution {
    public int singleNumber(int[] nums) {
        int x=0,n=nums.length;
        for(int i=0;i<n;i++)
            x^=nums[i];
        return x;
    }
}
