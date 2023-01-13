package _3;

/** 344
 Напишите функцию, которая переворачивает строку. Входная строка задается как массив символов s.
 Пример:

 Ввод: s = ['h', 'e', 'l', 'l', 'o']
 Вывод: ['o', 'l', 'l', 'e', 'h']
 */
public class ReverseString {

  public static void main(String[] args) {
    char[] array = {'1', '2', '3', '4', '5', '6'};
    new ReverseString().reverseString(array);
    System.out.println(array);
  }

  public void reverseString(char[] s) {

    for (int i = 0; i < s.length/2; i++) {
      int j =s.length - i - 1;
      char tmp = s[i];
      s[i] = s[j];
      s[j] = tmp;
      System.out.println(s);
    }
  }
}

