class Solution {
    public boolean isValid(String s) {
        if(s.length()<=1)
        return false;
        Stack<Character> st=new Stack<>();
        int flag=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
            st.push(ch);
            flag++;
            }
            else
            {
                flag--;
                if(!st.isEmpty())
                {
                char top=st.pop();
                if((top=='(' && ch!=')') || (top=='{' && ch!='}') || (top=='[' && ch!=']'))
                return false;
                }
            }
        }
        if(flag==0 && st.isEmpty())
        return true;
        else
        return false;
    }
}