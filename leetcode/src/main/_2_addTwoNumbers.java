package main;

import java.util.List;

/**
 * @author summer
 * @create 2022-08-16 10:27
 * @Description 2. 两数相加
 *              https://leetcode.cn/problems/add-two-numbers/
 */
public class _2_addTwoNumbers {

    /**
     * 两数分别按位逆序存储于节点,进行加和操作
     * @param l1    加数一
     * @param l2    加数二
     * @return      结果链表
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 定义头结点及尾节点
        ListNode head = null,tail = null;
        // 定义进位
        int carry = 0;
        // 遍历加数，进行求和操作
        while(l1 !=null || l2 != null){
            // 获取加数
            int num1 = l1 != null ? l1.val : 0;
            int num2 = l2 != null ? l2.val : 0;
            // 求和
            int sum = num1 + num2 + carry;
            if(null == head){
                head = tail = new ListNode((sum % 10));
            }else{
                tail.next = new ListNode((sum % 10));
            }
            // 重新计算进位
            carry = sum / 10;
            // 获取下一位被加位上的数
            l1 = l1.next != null ? l1.next : null;
            l2 = l2.next != null ? l2.next : null;
        }
        // 判断进位
        if(carry > 0){
            tail.next = new ListNode(carry);
        }
        return head;
    }

    public static void main(String[] args) {

    }
}

/**
 * 定义单向链表
 */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}