public class reverseStr {

  // public static void revStr(String str, int idx) {
  // if (idx == 0) {
  // System.out.print(str.charAt(idx));
  // return;
  // }
  // System.out.print(str.charAt(idx) + " ");
  // revStr(str, idx - 1);
  // }

  // Find Index 0 and last element
  public static int first = -1;
  public static int last = -1;

  public static void eleOccurance(String str, int idx, char element) {
    if (idx == str.length()) {
      System.out.println(first);
      System.out.println(last);
      return;
    }
    char currChar = str.charAt(idx);
    if (element == currChar) {
      if (first == -1) {
        first = idx;
      } else {
        last = idx;
      }
    }
    eleOccurance(str, idx + 1, element);
  }

  public static void main(String[] args) {
    // String str = "Preetam Singh";
    // revStr(str, str.length() - 1);

    // Find element:-
    String str = "abdefghaaara";
    eleOccurance(str, 0, 'a');
  }
}
