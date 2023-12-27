class Solution {
    public int buyChoco(int[] prices, int money) {
        int min1,min2;
        min1=min2=Integer.MAX_VALUE;
        for(int x:prices){
            if(min1>x)
            {
                min2=min1;
                min1=x;
            }
            else if(min2>x)
                min2=x;
        }
        int s=min2+min1;
        if((money-s)<0)
            return money;
        else
            return money-s;
    
    }
}
