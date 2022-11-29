// Contains the window
package Main;
import javax.swing.JFrame;
// To create an attribute of type JFrame, we have to import it first.

// To have a game window, we have to use JFrame.
public class GameWindow {
    private JFrame jframe;
    public GameWindow(GamePanel gamePanel) {
        jframe = new JFrame();
        jframe.setSize(400, 400);

        // telling Jframe that when we close the window, we want the program terminated
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // this is how we connect the gamePanel to the gameWindow
        jframe.add(gamePanel);


        jframe.setVisible(true);  // have to write this line to be able to see the window. Make sure its on the last line. to prevent bugs.
    }
}
