public class Task {
  public boolean fooBar(int zahl){
    boolean sol = false;

    if (zahl > 10 && (zahl <= 30 || zahl == 40) || zahl <= 10 && zahl == 3 ) {
      sol = true;
    } else {
      sol = false;
    }

    return sol;
  }
}
