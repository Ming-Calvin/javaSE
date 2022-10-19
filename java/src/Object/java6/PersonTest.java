package Object.java6;

/*
 * 类的结构之三:构造器(构造方法、constructor)的使用
 * constructor:
 *
 * 一、构造器的作用:
 * 1.创建对象
 * 2.初始化对象的属性
 *
 * 二、说明
 * 1.如果没有显示的定义类的构造器的话，则系统默认提供一个空参的构造器。
 * 2.定义构造器的格式:
 * 			权限修饰符  类名(形参列表) { }
 * 3.一个类中定义的多个构造器，彼此构成重载。
 * 4.一旦显示的定义了类的构造器之后，系统不再提供默认的空参构造器。
 * 5.一个类中，至少会有一个构造器
 */

public class PersonTest {
  public static void main(String[] args) {
    Person p = new Person();
    Person p1 = new Person(10, "ss");

  }
}

class Person {
  int age;
  String name;

  public Person() {
  }

  public Person(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }
}
