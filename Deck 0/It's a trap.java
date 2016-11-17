import codescape.Dogbot;

public class MyDogbot extends Dogbot {
  public void run() {
    String moves = "00110110000111021101110";

    for (int i = 0; i < moves.length(); i++) {
      char n = moves.charAt(i);
      switch (n) {
        case '0':
          move();
          break;
        case '1':
          turnLeft();
          break;
        case '2':
          pickUp();
          break;
      }
    }
  }
}
