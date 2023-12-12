class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0,c=0;
        for (final int num : nums)
            if (num != val){
                nums[i++] = num;
                c++;
            }
      while (i < nums.length)
            nums[i++] = 0;
     return c;
    }
}
