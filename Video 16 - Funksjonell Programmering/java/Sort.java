public class Sort {

  private int[] list = new int[]{5,3,6,9,1,4,8,2,7};

  private int[] sort(int[] xs) {
    for (int i=1; i<xs.length; ++i) {
      int j = i-1;
      int x = xs[i];
      while (j>=0 && x<xs[j]) {
        xs[j+1] = xs[j];
        --j;
      }
      xs[j+1] = x;
    }
    return xs;
  }

  public static void main(String[] args) {
    Sort app = new Sort();
    int[] sorted = app.sort(app.list);
    for (int x : sorted)
      System.out.print(x + " ");
  }

}
