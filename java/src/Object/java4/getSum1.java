package Object.java4;

// 例2:计算1-n之间所有自然数的乘积
//归求阶乘(n!)的算法

public class getSum1 {
  public static void main(String[] args) {
    getSum1 s = new getSum1();
    int n = s.getSum(100);

    System.out.println(n);
  }

  public int getSum(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * getSum(n-1);
    }
  }
}
