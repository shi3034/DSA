class LRUCache {
        int capacity;
        HashMap<Integer,Node> map;
    class Node{
        int val,key;
        Node prev;
        Node next;
        Node(int key,int val)
        {
            this.key=key;
            this.val=val;
        }
    }
    Node start,end;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.map=new HashMap<>();
        start=new Node(0,0);
        end=new Node(0,0);
        start.next=end;
        end.prev=start;
    }
    
    public int get(int key) {
        if(map.containsKey(key))
        {
            Node node=map.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        else
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
        {
            Node node=map.get(key);
            remove(node);
            insert(node);
            node.val=value;
        }
        else
        {
            Node node=new Node(key,value);
            int size=map.size();
            if(size==capacity)
            {
                Node lru=end.prev;
                remove(lru);
                map.remove(lru.key);

            }
            insert(node);
            map.put(key,node);
        }
    }
    private void remove(Node node)
    {
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    private void insert(Node node)
    {
        node.next=start.next;
        node.prev=start;
        start.next.prev=node;
        start.next=node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */