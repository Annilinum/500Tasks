package _8;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

class Solution {
  public static void main(String[] args) {
    ListNode list1 = makeList(1, 2, 4);
    ListNode list2 = makeList(1, 3, 4);

    print(list1);
    print(list2);

    print(new Solution().mergeTwoLists(list1, list2));
  }

  private static ListNode makeList(int... items) {
    var nodes = Arrays.stream(items).mapToObj(ListNode::new).toList();
    for (int i = 0; i < nodes.size() - 1; i++) {
      nodes.get(i).next = nodes.get(i + 1);
    }
    return nodes.get(0);
  }

  private static void print(ListNode node) {
    System.out.print("\n[");
    while (node != null) {
      System.out.print(node.val);
      if (node.next != null) System.out.print(" ");
      node = node.next;
    }
    System.out.println("]");
  }

  public static class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if (list1 == null) return list2;
    if (list2 == null) return list1;

    if (list1.val < list2.val) {
      list1.next = mergeTwoLists(list1.next, list2);
      return list1;
    } else {
      list2.next = mergeTwoLists(list1, list2.next);
      return list2;
    }
  }
}