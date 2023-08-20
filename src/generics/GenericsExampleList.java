package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExampleList {
  public static void main(String[] args) {
    // without generics
    List listWithoutGenerics = new ArrayList();
    listWithoutGenerics.add("Hello");
    listWithoutGenerics.add(15);

    // with generics
    List<String> listGenericsString = new ArrayList<String>();
    listGenericsString.add("Hello");
    listGenericsString.add("World");

    // foreach with generics
    for (Object element : listGenericsString) {
      System.out.println(element);
    }


   // foreach without generics
    for (Object element : listWithoutGenerics) {
      String str = (String) element; // need to cast
      System.out.println(str);
    }

  }
}