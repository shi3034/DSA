/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map=new HashMap<>();
        Node org=head;
        while(org!=null)
        {
            map.put(org,new Node(0));
            org=org.next;
        }
        org=head;
        while(org!=null)
        {
            Node copy=map.get(org);
            copy.val=org.val;
            copy.next=map.get(org.next);
            copy.random=map.get(org.random);
            org=org.next;
        }
        return map.get(head);
    }
}