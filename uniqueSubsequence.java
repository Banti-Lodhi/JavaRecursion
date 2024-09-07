import java.util.HashSet;

public class uniqueSubsequence {
  public static void uniqueSubsequenced(String str, int idx, String newString, HashSet<String> set) {
    // to be
    if (idx == str.length()) {
      if (set.contains(newString)) {
        return;
      } else {
        set.add(newString);
        System.out.println(newString);
        return;
      }
    }
    char currChar = str.charAt(idx);
    uniqueSubsequenced(str, idx + 1, newString + currChar, set);

    // to not be
    uniqueSubsequenced(str, idx + 1, newString, set);
  }

  public static void main(String[] args) {
    String str = "aaa";
    HashSet<String> set = new HashSet<>();
    uniqueSubsequenced(str, 0, "", set);
  }
}
