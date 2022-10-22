package Object.java9;

public class AnimalTest {
  public static void main(String[] args) {
    AnimalTest test = new AnimalTest();

    test.func(new Cat());
    test.func(new Dog());

  }

  public void func(Animal animal) {
    animal.eat();
    animal.shout();
  }
}

class Animal {
  public void eat() {
    System.out.println("eat");
  }

  public void shout(){
    System.out.println("shout");
  }
}

class Cat extends Animal {
  public void eat() {
    System.out.println("cat eat");
  }

  public void shout(){
    System.out.println("cat shout");
  }
}

class Dog extends Animal {
  public void eat() {
    System.out.println("dog eat");
  }

  public void shout(){
    System.out.println("dog shout");
  }
}
