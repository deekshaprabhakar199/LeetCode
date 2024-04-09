        ListNode prev = new ListNode(0, null);
    public ListNode reverseList(ListNode head) {
class Solution {
        ListNode curr= head;
        ListNode temp = new ListNode(0);
        while(curr != null){
            temp.next = curr.next;
            curr.next = prev.next;
            prev.next = curr;
            curr= temp.next;
        }
        return prev.next;
    }
}
[
