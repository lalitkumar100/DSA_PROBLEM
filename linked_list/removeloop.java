class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        // code here
        // remove the loop without losing any nodes
        HashSet<Node> set =new HashSet<>();
        set.add(head);
        while(head!=null){
            if(set.contains(head.next)){
                head.next=null;
            }
            else{
                set.add(head);
            }
            head=head.next;
        }
    }
}
