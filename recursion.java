public class recursion {

  // public static void printFib(int a, int b, int n) {
  // if (n == 0) {
  // return;
  // }
  // int c = a + b;
  // System.out.println(c);
  // printFib(b, c, n - 1);
  // }

  // X to Power n Formula
  public static int calcPower(int x, int n) {
    if (n == 0) {
      return 1;
    }
    if (x == 0) {
      return 0;
    }

    // int xtopowerm1 = calcPower(x, n - 1);

    // int xtopowern = x * xtopowerm1;
    // return xtopowern;

    // IInd method
    if (n % 2 == 0) {
      return calcPower(x, n / 2) * calcPower(x, n / 2);
    } else {
      return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
    }
  }

  public static void main(String[] args) {
    // int n = 1;
    // printRecursion(n);

    // printSum
    // printSum(1, 5, 0);

    // // PrintFactorial
    // int facts = Factorial(5);
    // System.out.println(facts);

    // // Fibbonacci Series\
    // int a = 0, b = 1;
    // System.out.println(a);
    // System.out.println(b);
    // int n = 7;
    // printFib(a, b, n - 2);

    // x to power n formula
    int x = 2, n = 5;
    int ans = calcPower(x, n);
    System.out.println(x + " to power " + n + " is equal to " + ans);
  }
}