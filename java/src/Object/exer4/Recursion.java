package Object.exer4;

/*
 * 输入一个数据n，计算斐波那契数列(Fibonacci)的第n个值
 * 1  1  2  3  5  8  13  21  34  55
 * 规律：一个数等于前两个数之和
 * 要求：计算斐波那契数列(Fibonacci)的第n个值，并将整个数列打印出来
 *
 */

public class Recursion {
  public static void main(String[] args) {
    Recursion r = new Recursion();
    int result = r.f(3);
    System.out.println(result);
  }

  public int f (int n) {
    if (n == 1 || n == 2) {
      return 1;
    }else {
      return f(n - 1) + f(n - 2);
    }
  }
}
