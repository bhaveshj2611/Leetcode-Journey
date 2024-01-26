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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            head = null;
            return head;
        }
		ListNode temp = head;
		int length =0;
		while(temp!=null){
			length++;
			temp = temp.next;
		}
		
		temp = head;
        int mid = length/2;
		for(int i=0;i<mid-1;i++){
			temp = temp.next;
		}
        if(temp.next != null){
            	temp.next = temp.next.next;
        }
	
		return head;
    }
}