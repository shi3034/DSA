class Solution {

    public int evalRPN(String[] tokens) {

        Stack<Integer> st=new Stack<>();

        for(String str: tokens)

        {

            if(!(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")))

            st.push(Integer.parseInt(str));

            else

            {

                int a=st.pop();

                int b=st.pop();

                if(str.equals("+"))

                st.push(a+b);

                else if(str.equals("-"))

                st.push(b-a);

                else if(str.equals("*"))

                st.push(a*b);

                else

                st.push(b/a);

            }

        }

        return st.pop();

        

    }

}



//use switch case and stack as deque/array

