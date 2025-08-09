class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str=new StringBuilder();
        int start=0,end=0,sum=0;
        while(end<s.length())
        {
            if(s.charAt(end)=='(')
            sum++;
            else
            sum--;
            if(sum==0)
            {
            str.append(s.substring(start+1,end));
            start=end+1;
            }
            end++;
        }
        return str.toString();
        
    }
}