import codescape.Dogbot;

public class MyDogbot extends Dogbot {
  public void run() {
    for (int i = 0; i < 3; i++) {
        move();
    }

    // state == 0: Laser noch aktiv
    // state == 1: Laser ausgeschaltet
    // state == 2: Level gelöst
    int state = 0;
    String moves = "110110";

    while (state < 2) {
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
      if (isMovePossible() && state == 0) {
        moves = "00210211010";
      } else if (state == 1) {
        state = 2;
      } else {
        moves = "110110";
      }
    }
  }
}
