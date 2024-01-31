/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // ListNode ans = new ListNode(0);
        // ListNode node = ans;
        // while (list1 != null && list2 != null) {
        //     if (list1.val < list2.val) {
        //         node.next = list1;
        //         list1 = list1.next;
        //         node = node.next;
        //     } else {
        //         node.next = list2;
        //         list2 = list2.next;
        //         node = node.next;
        //     }
        // }
        // if (list1 != null) {
        //     node.next = list1;
        // } else {
        //     node.next = list2;
        // }

        // return ans.next;

          ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                temp.next = list1;
                temp = temp.next;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                temp = temp.next;
                list2 = list2.next;
            }
        }

        while(list1==null && list2!=null){
            temp.next = list2;
            list2 = list2.next;
            temp = temp.next;

        }
        while(list2==null && list1!=null){
            temp.next = list1;
            list1 = list1.next;
            temp = temp.next;
        }

        return dummy.next;
    }
}