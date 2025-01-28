import java.util.*;

public class customComparator {
  public static Comparator<Integer> getComparator() {
    return new Comparator<Integer>() {
      @Override
      public int compare(Integer num1, Integer num2) {
        if (num1 < num2) {
          return 1;
        } else if (num1 > num2) {
          return -1;
        }
        return 0;
      }
    };
  };

  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(1);
    al.add(5);
    al.add(4);
    System.out.println(al);
    Collections.sort(al, getComparator());

    Collections.sort(al, (num1, num2) -> num1 - num2);
    System.out.println(al);

    PriorityQueue<Integer> pq = new PriorityQueue<>(getComparator());
    pq.add(1);
    pq.add(2);
    pq.add(3);
    pq.add(5);
    System.out.println(pq.poll());
  }
}
