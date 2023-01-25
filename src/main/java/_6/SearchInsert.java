package _6;

/** 35
 Учитывая отсортированный массив различных целых чисел и целевое значение,
 вернуть индекс, если цель найдена.
 Если нет, верните индекс туда, где он был бы, если бы он был вставлен по порядку.

 Пример 1:
 Ввод: числа = [1,3,5,6], цель = 5
 Вывод: 2

 Пример 2:
 Ввод: числа = [1,3,5,6], цель = 2
 Вывод: 1

 Пример 3:
 Ввод: числа = [1,3,5,6], цель = 7
 Вывод: 4
 */
public class SearchInsert {
  public static void main(String[] args) {
    int[] array = {1, 2, 4,8,9};
    System.out.println(new SearchInsert().searchInsert(array, 5));
  }

  public int searchInsert(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target || target < nums[i]) return i;
    }

    return nums.length;
  }
}
