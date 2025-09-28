class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==k)
        return "0";
        Stack<Character> st=new Stack<>();
        for(char c:num.toCharArray()){
        while(!st.isEmpty() && k>0 && st.peek()>c){
            st.pop();
            k--;
        }
        st.push(c);
        }
        while(k>0 && !st.isEmpty()){
        st.pop();
        k--;
        }
    StringBuilder sb=new StringBuilder();
    for(char a:st){
        sb.append(a);
    }
    while(sb.length()>0 && sb.charAt(0)=='0')
    sb.deleteCharAt(0);
    return sb.toString().equals("")?"0":sb.toString();   
    }
}