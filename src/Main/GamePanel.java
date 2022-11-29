// Contains the window decorations
package Main;
import javax.swing.JPanel;
import java.awt.Graphics;

public class GamePanel extends JPanel {

    // private JPanel jpanel; Diffrent method of using JPanel methods in our code, instead of creating an object, we inherit from the JPanel class.

    public GamePanel() {

    }

    // again this is an important method which prevents bugs.
    public void paintComponent(Graphics g) {
        // calling the paintComponent method from the super class. To call a super class method, we have to use the super keyword.
        super.paintComponent(g);

        // x and y are the co-ordinates for where you want to position the rectangle.
        g.drawRect(50,1,100,50);

        // Rectangle that's fully colored.
        g.fillRect(100,30,100,50);
    }
}
