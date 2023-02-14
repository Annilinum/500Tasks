package _8;

import java.util.Arrays;

class Solution {
  public static void main(String[] args) {
    ListNode list1 = makeList(5, 2, 4, 9);
    ListNode list2 = makeList(1, 3, 6, 1);

    print(list1);
    print(list2);

    sumLists(list1, list2);
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

  public static int listToNumber(ListNode list) {
    int n = 0;
    while (list != null) {
      n = 10 * n + list.val;
      list = list.next;
    }
    return n;
  }

  public static void sumLists(ListNode list1, ListNode list2) {
    int n = listToNumber(list1);
    int m = listToNumber(list2);
    System.out.println(n);
    System.out.println(m);
    int sum = n + m;
    System.out.println(sum);
    numberToArray(sum);
  }

  public static void numberToArray(int number) {
    int length = String.valueOf(Math.abs(number)).length();
    int[] result = new int[length];
    for (int i = 0; i < length; i++) {
      result[i] = number % 10;
      number = number / 10;
    }
    System.out.println(Arrays.toString(result));
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

/*  public ListNode mergeTwoLists(ListNode list1, ListNode -) {
    if (list1 == null) return list2;
    if (list2 == null) return list1;

    if (list1.val < list2.val) {
      list1.next = mergeTwoLists(list1.next, list2);
      return list1;
    }

    list2.next = mergeTwoLists(list1, list2.next);
    return list2;
  }*/

  public static void arrayToNumber(int[] array) {
    int[] arr = {1, 2, 3, 4, 5};
    int n = 0;
    for (int i : arr) {
      n = 10 * n + i;
    }
    System.out.println(n);
  }
}
