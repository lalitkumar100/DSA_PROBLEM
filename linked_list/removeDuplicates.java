class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        
        Node Next;
        Node cur =head.next;
        Node prev =head;
        HashSet<Integer> list = new HashSet<>();
         list.add(head.data);
        while(cur!=null){
            Next=cur.next;
            if(list.contains(cur.data)){
                prev.next=Next;
            
            }
            else{
              list.add(cur.data);
              prev=cur;
            }
            cur=Next;
        }
        // Your code here
        return head;
    }
}
