import java.awt.*;
import java.awt.event.*;

/*<applet code = Practical25 width=400 height=200>
</applet>
*/

public class Practical29 extends Frame{

    private String msg;
    private Panel labelPanel;
    private Label msglabel;

    Practical29(String title){
        super(title);
        msg = "JAVA ROCKS    ";
        labelPanel = new Panel();
        msglabel = new Label(msg);
    }
    
    public static void main(String[] args) {
        Practical29 app = new Practical29("Banner");
        app.init();
        app.start();
    }

    public void init(){
        setLayout(new GridBagLayout());
        msglabel.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,40));
        msglabel.setForeground(Color.RED);
        setSize(new Dimension(400,300));
        labelPanel.add(msglabel);
        add(labelPanel);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void start(){
        Thread runner = new Thread(() -> {
            try{
                while(true) {
                    msg = msg.substring(1)+msg.charAt(0);
                    Thread.sleep(250);
                    repaint();
                }
            } catch (InterruptedException e) { /* nothing to do */}
        });
        runner.start();
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        msglabel.setText(msg);
    }
}   