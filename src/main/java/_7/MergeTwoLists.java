package _7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/** 21
 Вам даны два отсортированных связанных списка list1 и list2.

 Объедините два списка в один отсортированный список.
 Список должен быть составлен путем соединения первых двух списков.
 */
public class MergeTwoLists {
  public static void main(String[] args) {
    List<Integer>array1 = new ArrayList<>(Arrays.asList(1,3,6,8));
    List<Integer>array2 = new ArrayList<>(Arrays.asList(6,7,9,12));
    System.out.println(new MergeTwoLists().mergeTwoLists(array1, array2));
  }

  public List<Integer> mergeTwoLists(List<Integer> list1, List<Integer> list2) {
    List<Integer> result = new ArrayList<>();
    result.addAll(list1);
    result.addAll(list2);
    Collections.sort(result);
    return result.stream().sorted().collect(Collectors.toList());
  }
}
