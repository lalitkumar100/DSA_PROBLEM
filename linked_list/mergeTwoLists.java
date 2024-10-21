/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head1=list1;
        ListNode head2=list2;
        ListNode head=null;
            if(head1==null||head2==null){
                if(head1==null&&head2==null)
                  return null;
                else if(head1==null)
                  return list2;
                else
                  return list1;
            }
            if(head1.val>head2.val){
              head=head2;
              head2=head2.next;
              
            }
            else{
              head=head1;
              head1=head1.next;
           
            }
        ListNode list=head;

        while(head1!=null&&head2!=null){
            if(head1.val>head2.val){
              head.next=head2;
              head2=head2.next;
              head=head.next;
            }
            else{
              head.next=head1;
              head1=head1.next;
              head=head.next;
            }
        }
            if(head1!=null){
            head.next=head1;
            }
              if(head2!=null){
            head.next=head2;
            }
            
      
       return list; 
    }
}
