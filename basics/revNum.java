class revNum{
  public int reverse(int n){
    int N = n;
    int revNum = 0;
    int len = String.valueOf(n).length();
    for(int i = 0; i<len;i++){
      int r = n%10;
      revNum = revNum*10+r;
      n = n/10;
    }
    return revNum;
  }
  public static void main(String[] args) {
    revNum r = new revNum();
    int a = r.reverse(123);
    System.out.println(a);
  }
}
