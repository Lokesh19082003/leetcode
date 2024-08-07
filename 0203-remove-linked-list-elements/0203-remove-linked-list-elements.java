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
    public ListNode removeElements(ListNode head, int val) {
     ListNode list=new ListNode(0);
     list.next=head;
     ListNode prev=list;
     ListNode cur=head;
     while(cur!=null){
        if(cur.val==val){
            prev.next=cur.next;
        }
        else{
            prev=cur;
        }
        cur=cur.next;
     }
     return list.next;
    }
}