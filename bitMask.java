import java.util.Scanner;

public class bitMask {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int pos = sc.nextInt();
    int n = 5;

    if (pos == 1) {
      int bitMask = 1 << pos;
      int bitMasknumber = bitMask | n;
      System.out.println(bitMasknumber);
    } else if (pos == 2) {
      int bitMask = 1 << pos;
      int notBitMask = ~(bitMask);
      int newNumber = notBitMask & n;
      System.out.println(newNumber);
    } else {
      System.out.println("Not Valid number for this bitMask Platform");
    }
  }
}
