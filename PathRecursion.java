public class PathRecursion {
  public static int countPath(int i, int j, int n, int m) {
    if (i == n || j == m) {
      return 0;
    }
    if (i == n - 1 && j == m - 1) {
      return 1;
    }
    // Move downWard
    int moveDown = countPath(i + 1, j, n, m);

    // moveRight
    int moveRight = countPath(i, j + 1, n, m);

    return moveDown + moveRight;
  }

  public static void main(String[] args) {
    int n = 3, m = 2;
    int countPaths = countPath(0, 0, n, m);
    System.out.println("Total Paths has take in reach the main point can be " + countPaths);
  }
}
