class Solution {
    public int xorOperation(int n, int start) {
        int x=start;
        for(int i=start+2;i<(start+2*n);i+=2)
            x=x^i;
        return x;
    }
}
