class Solution {
    public boolean isPalindrome(String s) {
        int t=0,e=s.length()-1;
        while(t<e){
            while(t<e && !Character.isLetterOrDigit(s.charAt(t)))
                t++;
            while(t<e && !Character.isLetterOrDigit(s.charAt(e)))
                e--;
            if(Character.toLowerCase(s.charAt(t))!=Character.toLowerCase(s.charAt(e)))
                return false;
            t++;e--; }
        return true;
    }
}
