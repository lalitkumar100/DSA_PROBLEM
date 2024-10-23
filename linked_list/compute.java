class Node {
   int data;
   Node next;

  Node(int data) {
      this.data = data;
  }
}
*/
class Solution {
    Node compute(Node head) {
        
        if(head.next==null||head==null){
         return head;   
        }
        
       int val=go(head.next,head);
        if(val>head.data){
          return head.next;
        }
     return head;
    }
    
    int go(Node head,Node prev){
        
        if(head.next==null){
         return head.data;   
        }
        int val=go(head.next,head);
        if(val>head.data){
          prev.next=head.next;
          return val;
        }
        else{
            return head.data;
        }
    }
    
    
}
