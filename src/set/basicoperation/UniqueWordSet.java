package set.basicoperation;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class UniqueWordSet {
  private Set<String> uniqueWords;

  public UniqueWordSet() {
    this.uniqueWords = new HashSet<>();
  }

  public Set<String> getUniqueWords() {
    return uniqueWords;
  }

  public void addNewWord(String word) {
    this.uniqueWords.add(word);
  }

  public void removeWord(String word) {
    this.uniqueWords.remove(word);
  }

  public boolean containsWord(String word) {
    return this.uniqueWords.contains(word);
  }

  public void findAllUniqueWords() {
    if (!uniqueWords.isEmpty()) {
      System.out.println(uniqueWords);
    } else {
      System.out.println("There are no unique words.");
    }
  }

  public static void main(String[] args) {
    UniqueWordSet uniqueWordSet = new UniqueWordSet();

    uniqueWordSet.addNewWord("Hello");
    uniqueWordSet.addNewWord("World");
    uniqueWordSet.addNewWord("Hello");
    uniqueWordSet.addNewWord("World");
    uniqueWordSet.addNewWord("hi");
    uniqueWordSet.addNewWord("hi");

    System.out.println(uniqueWordSet.uniqueWords.size());

    uniqueWordSet.findAllUniqueWords();
    if (uniqueWordSet.containsWord("Hello")) {
      System.out.println("The word 'Hello' is in the set.");
    } else {
      System.out.println("The word 'Hello' is not in the set.");
    }

    uniqueWordSet.removeWord("Hello");

    System.out.println(uniqueWordSet.uniqueWords.size());

  }
}
