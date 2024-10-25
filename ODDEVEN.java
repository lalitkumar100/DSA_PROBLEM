// User function Template for Java

/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node divide(Node head) {
        
        Node headodd = new Node(0);
        Node headEven =new Node(0);
        Node curO =headodd;
        Node curE =headEven;
        
        while(head!=null){
            if((head.data%2)==0){
                curE.next=head;
                curE=curE.next;
                  head=head.next;
            }
            else{
                curO.next=head;
                curO=curO.next;
                  head=head.next;
            }
          
        }
       
        curE.next=headodd.next;
        curO.next=null;
        return headEven.next;
        // code here
    }
}
