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
    public ListNode swapPairs(ListNode head) {
        
        ListNode dummyHead = new ListNode(), first, second, current = dummyHead;
        current.next = head;
        
        while(current.next != null && current.next.next!=null){
            first = current.next;
            second = first.next;
            current.next = second;
            first.next = second.next;
            
            second.next = first;
            current = second.next;
        }
        
        return dummyHead.next;
    }
}