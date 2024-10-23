class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
       DLLNode val =head;
      DLLNode extra =null;
        while(val.next!=null){
            extra=val.next;
            val.next=val.prev;
            val.prev=extra;
            val=extra;
        }
          extra=val.next;
            val.next=val.prev;
            val.prev=extra;
            return val;
     
    }
}
