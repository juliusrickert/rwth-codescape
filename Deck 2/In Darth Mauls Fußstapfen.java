import codescape.Dogbot;

public class MyDogbot extends Dogbot {
  public void run() {
    for (int i = 0; i < 6; i++) {
      while (!isMovePossible()) {
        rest();
      }
      move();
    }
  }
}
