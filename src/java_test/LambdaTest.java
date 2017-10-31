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
}

