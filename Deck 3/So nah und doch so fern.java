import codescape.Dogbot;

public class MyDogbot extends Dogbot {
  public void run() {
    turnLeft();
    move();

    int lastRoom = 1, room = 1;
    // 0 == left
    // 1 == right
    // string length == depth
    String solutions = "0";
    // false = left
    // true = right
    boolean thisMove = false;

    String password = null;

    while (room <= 6) {
      System.out.println(solutions);
      if (room == 6 && password == null) {
        turnRight();
        move();
        pickUp();
        turnLeft();
        password = read();
        turnLeft();
        move();
        turnRight();
      } else if (room == 1 && password != null) {
        turnRight();
        move();
        turnLeft();
        write(password);
        turnLeft();
        turnLeft();
        move();
        room = 7;
      } else if (room <= solutions.length()) {
        int move = Integer.parseInt(String.valueOf(solutions.charAt(room-1)));
        if (move == 0 && password == null || move == 1 && password != null) {
          turnLeft();
          move();
          turnRight();
        } else {
          turnRight();
          move();
          turnLeft();
        }
        room = Integer.parseInt(read());
      } else {
        if (thisMove) {
          turnLeft();
          move();
          turnRight();
        } else {
          turnRight();
          move();
          turnLeft();
        }
        lastRoom = room;
        room = Integer.parseInt(read());
        if (lastRoom < room) {
          solutions += (thisMove ? "0" : "1");
        }
        thisMove = !thisMove;
      }
    }
  }
}
