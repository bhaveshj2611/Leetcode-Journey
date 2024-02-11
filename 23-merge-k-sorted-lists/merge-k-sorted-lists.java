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
        // PriorityQueue<ListNode> pq = new PriorityQueue<>(
        //     (a,b) -> a.val - b.val
        // );
        // ListNode ans = new ListNode(0);
        // ListNode dummy = ans;
        
        
        //     for(ListNode node : lists){
        //     ListNode temp = node;
        //     while(temp!=null){
        //         pq.add(temp);
        //         // temp = temp.next;
        //         }

        
        //      }
        //      node = node.next;

        //      while(pq.size() > 0){
        //         dummy.next = pq.remove();
        //         dummy = dummy.next;
        //     }
            
            
        
        

            
           
          
            
        
        // return ans.next;

        List<Integer> list = new ArrayList<>();
        for(ListNode node : lists){
            while(node!=null){
                list.add(node.val);
                node = node.next;
            }
        }

        Collections.sort(list);
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        for(int i=0;i<list.size();i++){
            ListNode node = new ListNode(list.get(i));
            temp.next = node;
            temp = temp.next;
        }
        return ans.next;
    }
}