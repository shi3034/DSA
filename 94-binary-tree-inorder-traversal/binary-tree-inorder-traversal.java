/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode> st=new Stack();
        TreeNode ptr=root;
        while(true){
            if(ptr!=null){
                st.push(ptr);
                ptr=ptr.left;
            }
            else{
                if(st.isEmpty())
                break;
                ptr=st.pop();
                list.add(ptr.val);
                ptr=ptr.right;
            }
            
        }
        return list;
    }
}