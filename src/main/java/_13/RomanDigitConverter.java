package _13;

public class RomanDigitConverter {

  public static void main(String[] args) {
    System.out.println(new RomanDigitConverter().romanToInt("VI"));
  }

  public int romanToInt(String s) {
    char[] split = s.toCharArray();
    int sum = 0;
    for (int i = s.length() - 1; i >= 0; i--) {

      if (split[i] == 'I') {
        if (i > 0 && split[i - 1] == 'I') {
          sum = sum - 1 + 2;
        } else {
          sum += 1;
        }
      } else if (split[i] == 'V') {
        if (i > 0 && split[i - 1] == 'I') {
          sum = sum - 1 + 4;
        } else {
          sum += 5;
        }
      } else if (split[i] == 'X') {
        if (i > 0 && split[i - 1] == 'I') {
          sum = sum - 1 + 9;
        } else {
          sum += 10;
        }
      } else if (split[i] == 'L') {
        if (i > 0 && split[i - 1] == 'X') {
          sum = sum - 10 + 40;
        } else {
          sum += 50;
        }
      } else if (split[i] == 'C') {
        if (i > 0 && split[i - 1] == 'X') {
          sum = sum - 10 + 90;
        } else {
          sum += 100;
        }
      } else if (split[i] == 'D') {
        if (i > 0 && split[i - 1] == 'C') {
          sum = sum - 100 + 400;
        } else {
          sum += 500;
        }
      } else if (split[i] == 'M') {
        if (i > 0 && split[i - 1] == 'C') {
          sum = sum - 100 + 900;
        } else {
          sum += 1000;
        }
      }
    }
    return sum;
  }
}