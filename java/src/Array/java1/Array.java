package Array.java1;

/*
 * 	① 一维数组的声明和初始化
 *  ② 如何调用数组的指定位置的元素
 *  ③ 如何获取数组的长度
 *  ④ 如何遍历数组
 *  ⑤ 数组元素的默认初始化值：见ArrayTest1.java
 *  ⑥ 数组的内存解析：见ArrayTest1.java
 */

public class Array {
  public static void main(String[] args) {
    // 声明和初始化
    int[] ids;

    ids = new int[]{1, 10, 100};

    String[] names = new String[5];

    // 如何调用数组的指定位置的元素
    // 第三个
    System.out.println(ids[2]);

    // 如何获取数组的长度
    System.out.println(ids.length);

    // 如何遍历数组
    for(int i = 0; i < ids.length; i++) {
      System.out.println(ids[i]);
    }

    // 数组元素的默认初始化值
    int[] intArray = new int[1];
    float[] floatArray = new float[1];
    char[] charArray = new char[1];
    boolean[] booleanArray = new boolean[1];
    String[] stringArray = new String[1];

    System.out.println(intArray[0]);
    System.out.println(floatArray[0]);
    System.out.println(charArray[0]);
    System.out.println(booleanArray[0]);
    System.out.println(stringArray[0]);


  }
  
}
