public class Task {
  public int incrementJ(int zahl){
    int j = 0;
    if(zahl < 20) {
      for (int i = 20; zahl < i; i = i-2) {
        j++;
      }
    }
    return j;
  }
}
