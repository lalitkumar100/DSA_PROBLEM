/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
    
     Node()
     {
         this.data = 0;
         this.next = null;
     }
    
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
    
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class Solution
{
    public static Node sortList(Node head) {
        Node head0= new Node(-1);
        Node head1= new Node(-1);
        Node head2= new Node(-1);
        Node cur0=head0,cur1=head1,cur2=head2;

        while(head!=null){
            if(head.data==0){
              cur0.next=head;
              cur0=head;
            }
            else if(head.data==1){
              cur1.next=head;
              cur1=head;

            }
            else{
              cur2.next=head;
              cur2=head;

            }
            head=head.next;
        }
        cur0.next=head1.next;
        cur1.next=head2.next;
        cur2.next=null;
        return head0.next;
       
    }
}
