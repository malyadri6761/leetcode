class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length(),m=needle.length(); 
        if(haystack.contains(needle))
            for(int i=0;i<n;i++)
                if(haystack.substring(i,i+m).equals(needle))
                    return i;
        return -1;
    }
}
