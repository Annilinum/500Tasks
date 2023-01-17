package _5;

import _4.PalindromeNumber;

/** 4
 Напишите функцию, которая находит самую длинную строку общего префикса среди массива строк.

 Если общего префикса нет, вернуть пустую строку "".

 Пример 1:

 Ввод: strs = ["flower","flow","flight"]
 Вывод: "fl"

 Пример 2:

 Ввод: strs = ["dog","racecar","car"]
 Вывод: ""
 Объяснение: Среди входных строк нет общего префикса.
 */
public class LongestCommonPrefix {
  public static void main(String[] args) {
    String[] array = {"dog", "racecar", "car"};
    System.out.println(new LongestCommonPrefix().longestCommonPrefix(array));
  }

  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
    String prefix = strs[0];
    for (int i = 0; i < strs.length - 1; i++) {
      while (strs[i].indexOf(prefix) != 0) {
        prefix = prefix.substring(0, prefix.length() - 1);
      }
    }
    return prefix;
  }
}
