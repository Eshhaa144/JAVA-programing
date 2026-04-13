class arraycla {
  public static void main(String[] args) {

    int n = Integer.parseInt(args[0]);
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(args[i + 1]);
    }
    int maxIndex = Integer.parseInt(args[n + 1]);
    int minIndex = Integer.parseInt(args[n + 2]);

    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }

    System.out.println("The " + maxIndex + " largest element is: " + arr[n - maxIndex]);
    System.out.println("The " + minIndex + " smallest element is: " + arr[minIndex - 1]);
  }
}
