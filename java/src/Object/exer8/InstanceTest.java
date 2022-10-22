package Object.exer8;

/*
 * 建立InstanceTest 类，在类中定义方法method(Person e);
 *
 * 在method中:
 * (1)根据e的类型调用相应类的getInfo()方法。
 * (2)根据e的类型执行：
 * 		如果e为Person类的对象，输出：“a person”;
 * 		如果e为Student类的对象，输出：“a student”“a person ”
 * 		如果e为Graduate类的对象，输出：“a graduated student”
 * 		“a student” “a person”
 *
 */
public class InstanceTest {
  public static void main(String[] args) {

  }

  public void method(Person e) {
    e.getInfo();
  }
}


class Person {
  public String getInfo() {
    return "a person";
  }
}

class Student extends Person{
  public String getInfo() {
    return "a person";
  }
}

class Graduate extends Student{
  public String getInfo() {
    return "a person";
  }
}


