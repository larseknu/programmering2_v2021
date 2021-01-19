public class Main {

  public static void main(String[] args) {
      kalkulerKarater(70);
      kalkulerKarater(40);

      int minsteTall = finnMinsteTall(55, 42);

      System.out.println("Minste tall: " + minsteTall);
  }

  public static void kalkulerKarakter(int poeng) {
    if (60 <= poeng) {
      System.out.println("Bestått")
    }
    else {
      System.out.println("Ikke bestått")
    }
  }

  public static int finnMinsteTall(int tall1, int tall2) {
    int min;
    if (tall1 < tall2)
      min = tall1;
    else
      min = tall2;

    return min;
  }

}
