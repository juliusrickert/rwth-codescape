import codescape.Dogbot;

public class MyDogbot extends Dogbot {
  public void run() {
    String moves = "001021100100141110101110", str = "", turned = "";

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
          str = read();
        case '3':
  		for (int j = 0; j < str.length(); j++) {
		    turned += str.charAt(str.length()-j-1);
  		}
  		break;
  	  case '4':
  	    write(turned);
  	    break;
      }
    }
  }
}
