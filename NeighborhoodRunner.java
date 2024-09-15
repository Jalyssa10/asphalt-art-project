import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    // Creates the mural painter and makes the background color white
    BackgroundPainter background = new BackgroundPainter();
    background.paintBackground("white", 12);

    // Creates the pokeball painter and assigns indiviudal colors to each arguement
    SnakePainter snake = new SnakePainter();
    snake.paintSnake("green","black");

   
  }
}