import java.awt.*;
import java.awt.event.*;

public class Practical27 extends Frame{

    private Label display;
    private Panel displayPanel;

    public Practical27(String title){
        super(title);
        display = new Label("Please Move Mouse Inside Window");
        displayPanel = new Panel();
        setLayout(new GridBagLayout());
        displayPanel.add(display);
        add(displayPanel);
    }

    public static void main(String[] args) {
        Practical27 app = new Practical27("Mouse Events");
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
        addMouseListener(new MyMouseListener(display));
        addMouseMotionListener(new MyMouseMotionListener(display));
    }

    public void start(){
        setVisible(true);
    }

    public void paint(Graphics graphics){

    }
}

class MyMouseListener implements MouseListener{

    private Label display;

    public MyMouseListener(Label display) {
        this.display = display;
    }

    public void mouseEntered(MouseEvent e) {
        display.setText("Mouse Entered at x = "+e.getX()+"; y = "+e.getY());
    }

    public void mouseReleased(MouseEvent e) {
        display.setText("Mouse Released at x = "+e.getX()+"; y = "+e.getY());
    }

    public void mousePressed(MouseEvent e) {
        display.setText("Mouse Pressed at x = "+e.getX()+"; y = "+e.getY());
    }

    public void mouseClicked(MouseEvent e) {
        display.setText("Mouse Clicked at x = "+e.getX()+"; y = "+e.getY());
    }

    public void mouseExited(MouseEvent e) {
        display.setText("Mouse Exited at x = "+e.getX()+"; y = "+e.getY());
    }
}

class MyMouseMotionListener implements MouseMotionListener{
    private Label display;

    public MyMouseMotionListener(Label display) {
        this.display = display;
    }

    public void mouseMoved(MouseEvent e) {
        display.setText("Mouse moved at x = "+e.getX()+"; y = "+e.getY());
    }

    public void mouseDragged(MouseEvent e) {
        display.setText("Mouse dragged at x = "+e.getX()+"; y = "+e.getY());
    }
}