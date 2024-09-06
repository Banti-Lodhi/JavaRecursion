public class isSorted {
  public static boolean isSorteded(int arr[], int idx) {
    if (idx == arr.length - 1) {
      return true;
    }
    if (arr[idx] < arr[idx + 1]) {
      return isSorteded(arr, idx + 1);
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    int arr[] = { 1, 3, 7, 9, 8, 9 };
    System.out.println(isSorteded(arr, 0));
  }
}
