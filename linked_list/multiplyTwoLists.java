class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        int value1=0;
        int  value2=0;
      while(first!=null||second!=null){
        if(first!=null){
        value1=value1*10+(first.data);
           first=first.next;
        }
        if(second!=null){
             value2=value2*10+(second.data);
           second=second.next;
        }
      }
      return value1*value2;
    }
}
