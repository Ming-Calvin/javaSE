package Object.java10;

public class PersonTest {
  public static void main(String[] args) {
    /*
     * instanceof关键字的使用
     *
     * a instanceof A:判断对象a是否是类A的实例。如果，返回true，如果不是，返回false;
     *
     * 使用情境:为了避免在向下转型时出现ClassCastException异常，我们在进行向下转型之前，先进行
     * instanceof的判断,一旦返回true,就进行向下转型。如果返回false，不进行向下转型。
     *
     * 如果a instanceof A返回true,则a instanceof B也返回true。 其中类B是类A的父类。
     *
     */


    Person p1 = new Woman();
    p1.eat();

    Person p2 = new Man();
    p2.eat();

    Woman w1 = (Woman) p1;


    if(p2 instanceof Woman) {
      Woman w2 = (Woman) p2;
    } else {
      System.out.println("错误");
    }


  }
}
