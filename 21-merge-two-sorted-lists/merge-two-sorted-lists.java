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
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode head3= null;
        ListNode temp3 = head3;
        while(temp1!=null && temp2!=null){
            if(temp1.val<=temp2.val){
                ListNode node = new ListNode(temp1.val);
                if(head3==null){
                    head3 = node;
                }
                else {
                    temp3.next = node;
                }
                temp3 = node;
                temp1 = temp1.next;
                // temp1.next = temp1;
                // temp1 = temp1.next;
                
            }
            else if(temp2.val<temp1.val){
                ListNode node = new ListNode(temp2.val);
                if(head3==null){
                    head3 = node;
                }
                else {
                    temp3.next = node;
                }
                temp3 = node;
                temp2 = temp2.next;
            }
        }

        while(temp1!=null){
            ListNode node = new ListNode(temp1.val);
            if(head3 == null){
                head3 = node;
            }
            else temp3.next = node;
            temp3 = node;
            temp1 = temp1.next;
        }

        
        while(temp2!=null){
            ListNode node = new ListNode(temp2.val);
            if(head3 == null){
                head3 = node;
            }
            else temp3.next = node;
            temp3 = node;
            temp2 = temp2.next;
        }

        return head3;
    }
}