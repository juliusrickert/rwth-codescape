import codescape.Dogbot;

public class MyDogbot extends Dogbot {
  /**
   * Der Funktion run() wird ein Paramter überreicht
   * @param keys Array mit Passwort-Strings für die vier Konsolen
   */
  public void run(String[] keys) {
    String moves = "001211100121110011100011101112100111210000";
    int j = 0;

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
          write(keys[j]);
          j++;
          break;
      }
    }
  }
}
