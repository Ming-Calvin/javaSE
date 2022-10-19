package Object.java3;

/*
 * 方法的重载(overload) loading...
 *
 * 1.定义:在同一个类中，允许存在一个以上的同名方法，只要它们的参数个数或者参数类型不同即可。
 *
 * 		“两同一不同”:同一个类、相同方法名
 * 				  参数列表不同：参数个数不同，参数类型不同
 *
 * 2.举例:
 * 		Arrays类中重载的sort() / binarySearch()
 *
 * 3.判断是否重载
 * 		与方法的返回值类型、权限修饰符、形参变量名、方法体都无关。
 *
 * 4.在通过对象调用方法时，如何确定某一个指定的方法：
 * 		方法名---》参数列表
 */

public class OverLoadTest {
  public static void main(String[] args) {
    OverLoad o = new OverLoad();
    o.getSum(1, 2);
    o.getSum("1", 2);
    o.getSum(1.0, 2.0);

  }
};

class OverLoad {
  public void getSum(int i , int j) {
    System.out.println('1');
  }

  public void getSum(double d1 , double d2) {
    System.out.println('2');
  }

  public void getSum(String s , int i) {
    System.out.println('3');
  }
};
