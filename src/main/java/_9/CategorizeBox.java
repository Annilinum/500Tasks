package _9;

public class CategorizeBox {
  public static void main(String[] args) {
    System.out.println(new CategorizeBox().categorizeBox(100, 35, 1000, 700));
  }

  public String categorizeBox(int length, int width, int height, int mass) {
    boolean bulky = false;
    boolean heavy = false;
    if (length >= Math.pow(10, 4) || width >= Math.pow(10, 4) ||
        height >= Math.pow(10, 4)) {
      bulky = true;
    }
    if (length * width * height >= Math.pow(10, 9)) {
      bulky = true;
    }
    if (mass >= 100) {
      heavy = true;
    }

    if (bulky && heavy) {
      return "Both";
    } else if (bulky) {
      return "Bulky";
    } else if (heavy) {
      return "Heavy";
    } else {
      return "Neither";
    }
  }
}
