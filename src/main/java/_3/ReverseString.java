package _3;

/**
 1337

 Напишите функцию, которая переворачивает строку. Входная строка задается как массив символов s.

 Пример:

 Ввод: s = ['h', 'e', 'l', 'l', o'']
 Вывод: ['o', 'l', 'l', 'e', 'h']
 Пример 2:

 Ограничения:
 1 <= s.length <= 105
 */
public class ReverseString {

  public static void main(String[] args) {
    char[] array = {'H', 'a', 'n', 'n', 'a', '1'};
    System.out.println(new ReverseString().reverseString(array));
  }

  public String reverseString(char[] s) {
    StringBuilder result = new StringBuilder();
    for (int i = s.length - 1; i >= 0; i--) {
      result.append(s[i]);
    }
    return result.toString();
  }
}
