package Array.java1;

/*
 * 算法的考察：数组的复制、反转、查找(线性查找、二分法查找)
 */

public class Array3 {
  public static void main(String[] args) {
//    String[] arr = new String[]{"SS","QQ","YY","XX","TT","KK","EE","GG"};
    String[] arr = new String[]{"QQ","YY","XX","TT","KK","EE","GG"};

    // 复制
    String[] arr1 = new String[arr.length];
    for(int i = 0; i < arr.length; i++) {
      arr1[i] = arr[i];
    }

    // 反转
//    for(int i =0; i < arr.length/2 ; i++) {
//      String temp = arr[arr.length - i - 1];
//      arr[arr.length - i -1] = arr[i];
//      arr[i] = temp;
//    }

    for(int i = 0,j = arr.length - 1; i < j; i++, j--) {
      String temp = arr[j];
      arr[j] = arr[i];
      arr[i] = temp;
    }

    //遍历
    for(int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
