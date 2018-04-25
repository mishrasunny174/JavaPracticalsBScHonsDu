import java.awt.*;
import java.awt.event.*;

public class Practical28 extends Frame{

    private Label display;
    private Panel displayPanel;

    public Practical28(String title){
        super(title);
        display = new Label("Please press any key");
        displayPanel = new Panel();
        setLayout(new GridBagLayout());
        displayPanel.add(display);
        add(displayPanel);
    }

    public static void main(String[] args) {
        Practical28 app = new Practical28("Mouse Events");
        app.init();
        app.start();
    }

    public void init(){
        setSize(new Dimension(400,300));
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        addKeyListener(new KeyListener() {
            public void keyReleased(KeyEvent ke) {
                display.setText("Key Released: "+ke.getKeyChar());
            }

            public void keyPressed(KeyEvent ke) {
                display.setText("Key Pressed: "+ke.getKeyChar());
            }

            public void keyTyped(KeyEvent ke) {
                display.setText("Key Typed: "+ke.getKeyChar());
            }
        });
    }

    public void start(){
        setVisible(true);
    }

    public void paint(Graphics graphics){

    }
}