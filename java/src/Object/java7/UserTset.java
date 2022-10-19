package Object.java7;

/*
 * 总结:属性赋值的先后顺序
 *
 * ① 默认初始化值
 * ② 显式初始化
 * ③ 构造器中赋值
 * ④ 通过"对象.方法" 或 “对象.属性”的方式，赋值
 *
 * 以上操作的先后顺序:① - ② - ③ - ④
 *
 */

public class UserTset {
  public static void main(String[] args) {
    User u = new User();
    u.age = 5;

    System.out.println(u.age);

    User u1 = new User(1, "asf");
    System.out.println(u1.age);
    System.out.println(u1.xx);
  }

}

class User {
  int age = 2;
  String xx;

  public User() {
    age = 3;
  }

  public User(int age) {
    this.age = age;
  }

  public User(int age, String name) {
    this(age);
    this.xx = name;
  }

}
