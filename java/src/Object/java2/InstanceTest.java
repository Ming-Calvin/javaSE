package Object.java2;

public class InstanceTest {
  public static void main(String[] args) {
    new Phone().price = 20;
    new Phone().showPrice();

    PhoneMall mall = new PhoneMall();
    mall.show(new Phone());
  }
}
