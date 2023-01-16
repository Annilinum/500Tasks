package _4;

import _1.RichestCustomerWealth;

/** 9

 Учитывая целое число x, вернуть, true, если x это
 палиндром, и false в противном случае.

 Пример 1:

 Ввод: x = 121
 Вывод: true
 Объяснение: 121 читается как 121 слева направо и справа налево.

 Пример 2:

 Ввод: x = -121
 Вывод: false
 Объяснение: Слева направо читается -121. Справа налево получается 121-. Следовательно, это не палиндром.
 */
public class PalindromeNumber {
  public static void main(String[] args) {
    System.out.println(new PalindromeNumber().isPalindrome(45254));
  }

  public boolean isPalindrome(int x) {
    String str = String.valueOf(x);

    for (int i = 0; i < str.length() / 2; i++) {
      if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
        return false;
      }
    }
    return true;
  }
}
