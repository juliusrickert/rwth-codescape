import codescape.Dogbot;

public class MyDogbot extends Dogbot {
  public void run() {
    // Einlesen des Strings und Bewegung des RB zum Beginn des Labyrinths
		turnLeft();
		/**
		 * gelesen wird ein Wort, das aus den Buchstaben "L", "M" und "R" besteht
		 * getrennt werden die Buchstaben durch ein Komma
		 * die Variable "weg" könnte so aussehen: "M,L,M,M,R,M"
		 */
		String weg = "RR" + read() + "MLM";

    for (int i = 0; i < weg.length(); i++) {
      char n = weg.charAt(i);
      switch (n) {
        case 'M':
          move();
          break;
        case 'L':
          turnLeft();
          break;
        case 'R':
          turnRight();
          break;
      }
    }
  }
}
