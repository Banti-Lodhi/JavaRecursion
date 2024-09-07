public class CallGuest {
  public static int callGuests(int n) {
    if (n <= 1) {
      return 1;
    }
    // call Single Guest
    int singleGuest = callGuests(n - 1);

    // Pair Wise Guset call
    int pairGuest = (n - 1) * callGuests(n - 2);

    return singleGuest + pairGuest;
  }

  public static void main(String[] args) {
    int n = 4;
    System.out.println("Total number of ways to call of guest in party can be " + callGuests(n));
  }
}
