public class placeTiles {
  public static int placeTile(int n, int m) {
    if (n == m) {
      return 2;
    }
    if (n < m) {
      return 1;
    }
    // verticle tiles
    int verTiles = placeTile(n - m, m);
    System.out.println(verTiles);

    // horPlace Tiles
    int horTiles = placeTile(n - 1, m);
    // System.out.println(horTileshare );

    return verTiles + horTiles;
  }

  public static void main(String[] args) {
    int n = 4, m = 2;
    System.out.println(placeTile(n, m));
  }
}
