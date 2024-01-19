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
    public ListNode middleNode(ListNode head) {
        int length=0;
        ListNode temp = head;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        // System.out.println(length);
        ListNode ans = head;
        
            int index = length/2 + 1;
            for(int i=0;i<index-1;i++){
                ans = ans.next;
            }
        

        return ans;
    }
}