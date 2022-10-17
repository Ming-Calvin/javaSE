package Array.java1;

/*
 * 此题了解！！！
 *
 * 回形数格式方阵的实现
 * 从键盘输入一个整数（1~20）
 * 则以该数字为矩阵的大小，把 1,2,3…n*n 的数字按照顺时针螺旋的形式填入其中。例如： 输入数字2，则程序输出： 1 2
 * 4 3
 * 输入数字 3，则程序输出：1 2 3
 * 8 9 4
 * 7 6 5
 * 输入数字 4， 则程序输出：
 * 1   2   3   4
 * 12  13  14  5
 * 11  16  15  6
 * 10  9   8   7
 */

public class exer1 {
  public static void main(String[] args) {
    int len = 4;
    int[][] arr = new int[len][len];

    int s = len * len;

    int k = 1;
    // 1 -- 右 ； 2 -- 下 ； 3 -- 左； 4 --上

    int x = 0;
    int y = 0;

    for(int m = 1; m <= s; m++) {
      if(k == 1) {
        if(y < len && arr[x][y] == 0) {
          arr[x][y++] = m;
        } else {
          k = 2;
          x++;
          y--;
          m--;
        }
      }
      else if (k == 2) {
        if(x < len && arr[x][y] == 0) {
          arr[x++][y] = m;
        } else {
          x--;
          y--;
          k = 3;
          m--;
        }
      }
      else if(k == 3) {
        if (y >= 0 && arr[x][y] == 0) {
          arr[x][y--] = m;
        } else {
          y++;
          x--;
          k = 4;
          m--;
        }
      }
      else if(k == 4){
        if(x >= 0 && arr[x][y] == 0) {
          arr[x--][y] = m;
        } else {
          x++;
          y++;
          m--;
          k = 1;
        }
      }
    }





    for(int i = 0; i < arr.length; i++) {
      for(int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + "   ");
      }
      System.out.println(' ');
    }




  }
}
