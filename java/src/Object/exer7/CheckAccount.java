package Object.exer7;

public class CheckAccount extends Account {
  private double overdraft;

  public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
    super(id, balance, annualInterestRate);
    this.overdraft = overdraft;
  }

  public double getOverdraft() {
    return overdraft;
  }

  public void setOverdraft(double overdraft) {
    this.overdraft = overdraft;
  }

  @Override
  public void withdraw(double amount) {
    super.withdraw(amount);
  }
}
