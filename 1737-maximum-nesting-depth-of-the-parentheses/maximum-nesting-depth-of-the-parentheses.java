class Solution {
    public int maxDepth(String s) {
        int currDepth=0;
        int maxDepth=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='('){
            currDepth++;
            if(currDepth>maxDepth)
            maxDepth=currDepth;
            }
            else if(s.charAt(i)==')')
            currDepth--;

        }
        return maxDepth;
    }
}