class Solution {
    public int maxProduct(int[] nums) {
        int large=Integer.MIN_VALUE;
        int small=Integer.MIN_VALUE;
        for(int i:nums){
            if(i>=large){
                small=large;
                large=i;
            }
            else if(small<=i && i!=large)
                small=i;
        }
        return (small-1)*(large-1);
    }
}
