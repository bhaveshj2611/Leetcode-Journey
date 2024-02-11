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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // ListNode ans = new ListNode(0);
        // ListNode dummy = ans;
        
        
            for(ListNode node : lists){
            while(node!=null){
                pq.add(node.val);
                node = node.next;
                }
             }
             

             ListNode ans = new ListNode(0);
             ListNode temp = ans;
             while(pq.size() > 0){
                 ListNode node = new ListNode(pq.remove());
                temp.next = node;
                temp = temp.next;
             }
            
            
        
        

            
           
          
            
        
        return ans.next;

       
    }
}