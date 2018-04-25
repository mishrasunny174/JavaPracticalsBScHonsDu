import java.applet.*;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.Label;
import java.awt.GridBagLayout;
import java.awt.Font;
import java.awt.Color;

/*<applet code = Practical25 width=400 height=200>
</applet>
*/

public class Practical25 extends Applet{

    private String msg = "JAVA ROCKS    ";
    private Panel labelPanel;
    private Label msglabel;

    @Override
    public void init(){
        setLayout(new GridBagLayout());
        labelPanel = new Panel();
        msglabel = new Label(msg);
        msglabel.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,40));
        msglabel.setForeground(Color.RED);
        setSize(new Dimension(400,200));
        labelPanel.add(msglabel);
        add(labelPanel);
    }

    @Override
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

    }

    @Override
    public void paint(Graphics graphics) {
        msglabel.setText(msg);
    }
}   