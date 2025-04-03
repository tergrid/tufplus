package classes;

class classes {
  public static class BankAccount{
    private String name;
    private double balance;

    BankAccount(String name, double balance){
      this.name = name;
      this.balance = balance;
    }

    public void setName(String name){
      this.name = name;
    }
    public String getName(){
      return name;
    }
    public double getBalance(){
      return balance;
    }
  }
  public static void main(String[] args) {
    BankAccount ba = new BankAccount("Harshit",24000);
    System.out.println(ba.name);
    System.out.println(ba.balance);
  }
}
