        for(int i=0; i<n; i++){
        ListNode right = head;
        ListNode curr= head;
        ListNode left= head;
        int lp=0, cp=0, rp=0;
    public ListNode removeNthFromEnd(ListNode head, int n) {
class Solution {
 */
 * }
            if(right.next == null) return head.next;
            right = right.next;
            rp++;
        }
        while(right != null){
            right = right.next;
            rp++;
            left= left.next;
            lp++;
        }
        while(cp < lp-1){
            curr=curr.next;
            cp++;
[
