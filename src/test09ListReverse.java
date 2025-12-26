/**
 * @author Licyh
 * @version: 1.0
 * @since 2025/6/11 - 06 - 11 - 20:23
 * Description: PACKAGE_NAME
 */
public class test09ListReverse {
    public static class ListNode{
        public int val;
        public ListNode next;

        public ListNode() {
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    // 反转单链表测试链接 : https://leetcode.cn/problems/reverse-linked-list/
    public static ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode next = null;
        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

}
