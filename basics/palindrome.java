
class palindrome{
  
  public boolean isPalindromeFn(int n){
    int revNum = 0;
    int copy = n;
    int len = String.valueOf(copy).length(); 
    for(int i = 0; i < len ; i++){
      int r = copy%10;
      revNum=revNum*10+r;
      copy = copy/10;
    }
    if(revNum == n){
      return true;
    } else return false;
  }

  public static void main(String[] args) {
    palindrome p = new palindrome();
    boolean b = p.isPalindromeFn(121);
    System.out.println(b);
  }
}


