class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        ArrayList<String> arr=new ArrayList<>(Arrays.asList(s.split(" ")));
        Collections.reverse(arr);
        StringBuilder str=new StringBuilder();
        for(String ptr:arr)
        {
            if(ptr=="")
            continue;
            str.append(ptr).append(" ");
        }
        str.deleteCharAt(str.length()-1);
        return str.toString();
        
    }
}