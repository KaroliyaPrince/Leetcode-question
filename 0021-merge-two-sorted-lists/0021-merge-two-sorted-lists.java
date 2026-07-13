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

        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode first = new ListNode();
        ListNode current = first;

        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                ListNode newNode = new ListNode(p1.val);
                p1 = p1.next;
                current.next = newNode;
                current = newNode;
            }

            else{
                ListNode newNode = new ListNode(p2.val);
                p2 = p2.next;
                current.next = newNode;
                current = newNode;
            }
        }

        if(p1 != null){
            while(p1!=null){
                ListNode newNode = new ListNode(p1.val);
                p1 = p1.next;
                current.next = newNode;
                current = newNode;
            }
        }

        
        if(p2 != null){
            while(p2!=null){
                ListNode newNode = new ListNode(p2.val);
                p2 = p2.next;
                current.next = newNode;
                current = newNode;
            }
        }

        return first.next;
    }
}