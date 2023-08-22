package map.basicoperations;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
  private Map<String, String> words;

  public Dictionary() {
    this.words = new HashMap<>();
  }

  public void addNewWords(String word, String definition) {
    this.words.put(word, definition);
  }

  public void removeWords(String word) {
    this.words.remove(word);
  }

  public void showWords() {
    for (String word : this.words.keySet()) {
      System.out.println(word + " : " + this.words.get(word));
    }
  }

  public void findByWord(String word) {
    if (this.words.containsKey(word)) {
      System.out.println(word + " : " + this.words.get(word));
    } else {
      System.out.println("Word not found");
    }
  }

  public static void main(String[] args) {
    Dictionary dictionary = new Dictionary();

    dictionary.addNewWords("programmer", "A person who writes computer programs");
    dictionary.addNewWords("bug", "A fault in a program which causes it to behave unexpectedly");
    dictionary.addNewWords("debugging", "The process of finding and removing bugs from a program");
    dictionary.addNewWords("monitor", "A device used for observing, checking, or keeping a continuous record of something");

    dictionary.showWords();

    System.out.println("Finding word programmer");
    dictionary.findByWord("programmer");

    System.out.println("Removing word bug");
    dictionary.removeWords("bug");

    dictionary.showWords();
  }
}
