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
    public void reorderList(ListNode head) {
      Stack<ListNode> st = new Stack<>();
      ListNode temp = head;
      int length=0;
      while(temp!=null){
          st.push(temp);
          temp = temp.next;
          length++;
      }

      temp = head;
      for(int i=0;i<length/2;i++){
          ListNode nxt = temp.next;
          temp.next = st.peek();
          st.pop().next = nxt;
          
          
          temp = temp.next.next;
      }
      temp.next = null;
}
}