package _10;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
  public static void main(String[] args) {
    System.out.println(new FizzBuzz().fizzBuzz(28));
  }

  public List<String> fizzBuzz(int n) {
    List<String> answer = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      String s = checkNumber(i);
      answer.add(s);
    }
    return answer;
  }

  public String checkNumber(int n) {
    if (n % 3 == 0 && n % 5 == 0) {
      return "FizzBuzz";
    } else if (n % 3 == 0) {
      return "Fizz";
    } else if (n % 5 == 0) {
      return "Buzz";
    }
    return Integer.toString(n);
  }
}
