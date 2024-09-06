package sorts.sortSelection;

public class SelectionSort_RE {
  public static void main(String[] args) {
    // Quadratic time O(n^2)
    // small data set = ok
    // large data set = BAD

    int array[] = { 2, 1, 12, -3, 7, 8, 3, 1, 4, 9, 8, 1, 12, 43, 3, 23 };
    selectionSort(array);

    System.out.println("Selection Sort");
    for (int i : array) {
      System.out.print(i + ", ");
    }
  }

  private static void selectionSort(int[] array) {
    for (int i = 0; i < array.length; i++) {
      int min = i;
      for  (int j = i + 1; j < array.length; j++) {
          if(array[min] > array[j]) {
              min = j;
          }
      }
      int temp = array[i];
      array[i] = array[min];
      array[min] = temp;
    }
  }
}
