package oops;

public class encapsulation{
  public static class BankAccount{
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, double balance){
      this.accountHolderName = accountHolderName;
      this.balance = balance;
    }

    public String getAccountHolderName(){
      return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName){
      this.accountHolderName = accountHolderName;
    } 
    public double getBalance(){
      return balance;
    }
    public void deposit(double amount){
      if(amount>0){
        balance += amount;
      } else {
        System.out.println("Deposit amount must be positive");
      }
    }
    public void withdraw(double amount){
      if(amount > balance){
        System.out.println("Insufficient funds");
      } else {
        balance -= amount;
      }
    }
  }
  public static void main(String[] args) {
    BankAccount ba = new BankAccount("Harshit", 25000); 
    System.out.println(ba.accountHolderName);
    System.out.println(ba.balance);
  }
}
