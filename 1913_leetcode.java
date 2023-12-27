class Solution {
    public int maxProductDifference(int[] nums) {
       int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
       int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
       for(int x:nums){
           if(max1<x)
           {
               max2=max1;
               max1=x;
           }
           else if(max2<x)
                max2=x;
           if(min1>x){
               min2=min1;
               min1=x;
           }
           else if(min2>x)
                min2=x;
       }
       return max1*max2-min1*min2;
    }
}
