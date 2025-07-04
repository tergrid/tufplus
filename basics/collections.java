import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

class collections {
  public static void main(String[] args) {
    // List interface derived
    // ArrayList
    System.out.println("ArrayList testing");
    ArrayList<Integer> aList = new ArrayList<>();
    aList.add(2);
    aList.add(3);
    aList.add(4);
    aList.add(5);
    aList.add(6);
    aList.size();
    aList.get(3);
    System.out.println(aList);

    // LinkedList
    System.out.println("LinkedList testing");
    LinkedList<Integer> ll = new LinkedList<>();
    ll.addFirst(1);
    ll.addAll(aList);
    ll.addLast(10);
    System.out.println(ll);

    // stack
    System.out.println("stack testing");
    Stack<Integer> st = new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    System.out.println(st);
    System.out.println(st.peek());
    st.pop();
    System.out.println(st);

    // Vector
    System.out.println("Vector testing");
    Vector<Integer> vt = new Vector<>();
    vt.add(1);
    vt.addAll(aList);
    System.out.println(vt);

    // HashSet
    System.out.println("HashSet testing");
    HashSet<Integer> hs = new HashSet<>();
    hs.add(1);
    hs.add(2);
    hs.add(1);
    hs.add(0);
    System.out.println(hs);
    for (var num : hs) {
      System.out.println(num);
    }

    // TreeSet
    System.out.println("TreeSet testing");
    TreeSet<Integer> ts = new TreeSet<>();
    ts.add(2);
    ts.add(3);
    ts.add(1);
    ts.add(0);
    System.out.println(ts);
    System.out.println(ts.floor(8));
    System.out.println(ts.ceiling(8));

    // ArrayDeque
    System.out.println("ArrayDeque testing");

    ArrayDeque<Integer> ad = new ArrayDeque<>();

    ad.offer(2);
    ad.offer(6);
    ad.offer(9);
    ad.offer(10);
    System.out.println(ad);
    System.out.println(ad.peek());
    ad.poll();
    System.out.println(ad.peek());

    // PriorityQueue
    System.out.println("PriorityQueue testing");
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.offer(0);
    pq.offer(110);
    pq.offer(4);
    pq.offer(5);
    pq.offer(26);
    pq.offer(8);

    System.out.println(pq);
    System.out.println(pq.peek());
    pq.poll();
    System.out.println(pq);
    pq.poll();
    System.out.println(pq);

    System.out.println("HashMap testing");
    HashMap<Integer, Integer> hm = new HashMap<>();
    hm.put(1, 2);
    System.out.println(hm);

    System.out.println("TreeMap testing");
    TreeMap<Integer, String> tm = new TreeMap<>();
    tm.put(1, "Raj");
    tm.put(2, "Harsh");
    tm.put(3, "Golu");
    tm.put(4, "Bunty");
    tm.put(5, "Ramesh");
    System.out.println(tm);
    tm.remove(2);
    System.out.println(tm);
    tm.put(2, "Harsh");
    System.out.println(tm);

    Iterator<Integer> iterator = aList.iterator();
    while (iterator.hasNext()) {
      Integer num = iterator.next();
      System.out.println(num);
    }

    Collections.sort(aList);
    Collections.min(ts);
    Collections.max(ll);
    Collections.reverse(ll);
    System.out.println(Collections.frequency(aList, 1));
  }
}
