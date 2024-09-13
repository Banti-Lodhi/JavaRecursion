import java.util.ArrayList;

public class subSetCall {
  public static void printSubset(ArrayList<Integer> subset) {
    for (int i = 0; i < subset.size(); i++) {
      System.out.print(subset.get(i) + " ");
    }
    System.out.println();
  }

  public static void findsubSets(int n, ArrayList<Integer> subset) {
    if (n == 0) {
      printSubset(subset);
      return;
    }
    // Add subset
    subset.add(n);
    findsubSets(n - 1, subset);

    // Not add Subset
    subset.remove(subset.size() - 1);
    findsubSets(n - 1, subset);
  }

  public static void main(String[] args) {
    int n = 3;
    ArrayList<Integer> subset = new ArrayList<>();
    findsubSets(n, subset);
  }
}
