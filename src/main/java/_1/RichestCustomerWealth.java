package _1;

/** 1672
 Вам дана m x n целочисленная сетка account s, где accounts[i][j] сумма денег у клиента в банке.
 Верните богатство , которое есть у самого богатого клиента.

 Богатство клиента — это сумма денег, которую он имеет на всех своих банковских счетах.
 Самый богатый клиент — это клиент, который имеет максимальное богатство .



 Пример 1:

 Ввод: счета = [[1,5],[7,3],[3,5]]
 Вывод: 10
 Объяснение :
 1-й клиент имеет богатство = 6
 2-й клиент имеет богатство = 10
 3-й клиент имеет богатство = 8
 Второй покупатель — самый богатый, его состояние равно 10.

 Ограничения:

 m == accounts.length
 n == accounts[i].length
 1 <= m, n <= 50
 1 <= accounts[i][j] <= 100

*/


public class RichestCustomerWealth {

  public static void main(String[] args) {
    System.out.println(new RichestCustomerWealth());
  }

  public int maximumWealth(int[][] accounts) {
    int n = accounts.length;
    int m = accounts[0].length;
    int max = 0;

    for (int i = 0; i < n; i++) {
      int wealth = 0;
      for (int j = 0; j < m; j++) {
        wealth += accounts[i][j];
      }
      max = Math.max(max, wealth);
    }
    return max;
  }
}