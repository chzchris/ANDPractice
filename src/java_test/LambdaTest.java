package java_test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaTest {

  public static void main(String arg[]) {
    System.out.println("--------------- test start ---------------");
    LambdaTest test = new LambdaTest();
    test.iterateList();
    test.iterateMap();
    test.printList();
    test.computeFilter();
    System.out.println("---------------  test end  ---------------");
  }

  public void iterateList() {
    List<String> list = new ArrayList<>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    list.add("E");

    list.forEach(s -> System.out.println(s));
    System.out.println();
  }

  public void iterateMap() {
    Map<String, String> map = new HashMap<String, String>();
    map.put("1", "A");
    map.put("2", "B");
    map.put("3", "C");
    map.put("4", "D");

    map.forEach((k, v) -> System.out.println(k + " : " + v));
    System.out.println();
  }

  public void printList() {
    List<String> list = new ArrayList<>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    list.add("E");

    list.forEach(System.out::print);
    System.out.println();
  }

  public void computeFilter() {
    List<String> list = new ArrayList<String>();
    list.add("1");
    list.add("2");
    list.add("3");
    list.add("5");
    list.add("4");
    list.stream().filter(s -> Integer.valueOf(s) < 3).forEach(System.out::println);
    System.out.println();
  }
}

