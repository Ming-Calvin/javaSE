package Array.java1;

/*
 * 数组的冒泡排序的实现
 *
 */

public class Array4 {
  public static void main(String[] args) {
    int[] arr = new int[]{43,32,76,92,-65,85,71,-42};

    for(int i = 0; i < arr.length; i++) {
      for(int j = 0; j < arr.length -1 - i; j++) {
        if(arr[j] < arr[j+1]) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }

    for(int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
