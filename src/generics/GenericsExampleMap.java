package generics;

import java.util.HashMap;
import java.util.Map;

public class GenericsExampleMap {
  // without generics
  public static void main(String[] args) {
    Map mapWithoutGenerics = new HashMap();

    mapWithoutGenerics.put("key1", "value1");
    mapWithoutGenerics.put("key2", "value2");

    String result = (String) mapWithoutGenerics.get("key");

    System.out.println(result);

    // with generics
    // first type for key and second type for value
    Map<String, Integer> mapWithGenerics = new HashMap<>();
    mapWithGenerics.put("key1", 1);
    mapWithGenerics.put("key2", 2);


    // foreach with generics
    for (Map.Entry<String, Integer> entry : mapWithGenerics.entrySet()) {
      String key = entry.getKey();
      Integer value = entry.getValue();
      System.out.println("key: " + key + " value: " + value);
    }

    // foreach without generics
    for (Object object: mapWithoutGenerics.entrySet()) {
      Map.Entry entry = (Map.Entry) object;
      String key = (String) entry.getKey();
      Integer value = (Integer) entry.getValue();
      System.out.println("key: " + key + " value: " + value);
    }
  }
}
