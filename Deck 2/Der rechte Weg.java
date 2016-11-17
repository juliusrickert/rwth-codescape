import codescape.Dogbot;

public class MyDogbot extends Dogbot {
  /**
   * Der Funktion run() wird ein Paramter überreicht,
   * der zum Lösen des Raums benötigt wird.
   * @param nr Nummer des Teleporters, der zum Ausgang führt
   */
  public void run(int nr) {
    String moves = "";

    if (nr <= 2) {
        moves += "0100011100";
    } else {
        moves += "0111000100";
    }

    if (nr % 2 == 1) {
        moves += "10011020";
    } else {
        moves += "11100020";
    }

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
