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
        if(head == null) return;
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode curr = slow.next;
        slow.next = null;
        ListNode prev = null;
        while(curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        ListNode first = head, second = prev;
        
        while(second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
    }
}
/*
Step 3: Merge/Weave the Two Halves Together
Set first = head (start of the forward half).
Set second = prev (start of the reversed second half).
Loop while second != null:
Bookmark next nodes:
temp1 = first.next
temp2 = second.next
Weave pointer from first half to second half:
first.next = second
Weave pointer from second half to next node of first half:
second.next = temp1
Advance both pointers to their bookmarked nodes:
first = temp1
second = temp2
*/







