import org.code.neighborhood.*;

public class SnakePainter extends BackgroundPainter {

    public SnakePainter() { 
    }

    // Combines methods to create the smiley face
    public void paintSnake(String faceColor, String eyeColor) {
        paintTop(faceColor, eyeColor);
        paintBottom(faceColor);
        resetPosition();
    }

    // Paints the top half of the smiley face
    public void paintTop(String faceColor, String eyeColor) {
        move();
      paintLine(faceColor, 6);
        turnRight();
        move();
        turnRight();
        paintLine(faceColor, 2);
        paintLine(eyeColor, 1); // Left eye
        paintLine(faceColor, 2);
        paintLine(eyeColor, 1); // Right eye
        paintLine(faceColor, 2);
        turnLeft();
        move();
      turnLeft();
      
        paintLine(faceColor, 1);
        paintLine(faceColor, 7);
        paintLine(faceColor, 1);
        turnRight();
        move();
        turnRight();
        paintLine(faceColor, 7);

      //------//
      turnRight();
    }

    // Paints the bottom half of the smiley face (including the mouth)
    public void paintBottom(String faceColor) {
        turnRight();
      turnRight();
      move();
      move();
      move();
      turnLeft();
      paintLine(faceColor, 9);
      paintLine(faceColor, 3);
        turnLeft();
      move();
        turnLeft();
       paintLine(faceColor, 2);
      paintLine(faceColor, 2);
        turnRight();
      move();
       turnRight();
       paintLine(faceColor, 4);
    }

}
