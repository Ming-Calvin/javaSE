package Array.java1;

/*  ① 二维数组的初始化
 *  ② 如何调用数组的指定位置的元素
 *  ③ 如何获取数组的长度
 *  ④ 如何遍历数组
 *  ⑤ 数组元素的默认初始化值:见ArrayTest3.java
 *  ⑥ 数组的内存解析:见ArrayTest3.java
 * */


public class Array2 {
  public static void main(String[] args) {
    // ① 二维数组的初始化
    // 静态
    String[][] arr1 = new String[][]{{"a", "b", "c"}, {"d", "e", "f"}};
    // 动态
    String[][] arr2 = new String[3][2];
    String[][] arr3 = new String[3][];

    // ② 如何调用数组的指定位置的元素
    System.out.println(arr1[0][1]);

    // ③ 如何获取数组的长度
    System.out.println(arr1.length);
    System.out.println(arr1[0].length);

    // ④ 如何遍历数组
    for(int i = 0 ; i < arr1.length ; i++) {
      for(int j = 0; j < arr1[i].length; j++) {
        System.out.println(arr1[i][j]);
      }
    }

    // ⑤ 数组元素的默认初始化值
    System.out.println(arr2[1]); // 地址
    System.out.println(arr2[1][1]); // null

    int[][] arr4 = new int[3][3];
    System.out.println(arr4[2]); // 地址
    System.out.println(arr4[2][2]); // 0
  }





}
