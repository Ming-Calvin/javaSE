package Object.exer3;

public class PassObject {

//  public void PrintArea(Circle c, int time) {
//    for(int i = (int)(c.radius); i <= time; i++) {
//      System.out.println(i);
//
//      c.findArea();
//    }
//  }

  public void printAreas(Circle c, int time) {

    System.out.println("");

    // 设置圆半径
    for(int i = 1; i <= time; i++) {
      c.radius = i;
      System.out.println(c.radius + c.findArea());
    }

    // 重新复制
    c.radius = time + 1;
  }

};


