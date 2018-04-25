import java.applet.*;
import java.awt.Panel;
import java.awt.Label;
import java.awt.GridLayout;

/*
<applet code="Practical26" width=400 height=200>
</applet>
*/ 

public class Practical26 extends Applet{

    private Label documentUrlLabel;
    private Label codeUrlLabel;

    @Override
    public void init(){
        documentUrlLabel = new Label("Document URL: "+getDocumentBase().toString());
        codeUrlLabel = new Label("CodeBase URL: "+getCodeBase().toString());
        setLayout(new GridLayout(2,1));
        add(documentUrlLabel);
        add(codeUrlLabel);
    }

    @Override
    public void start(){
        showStatus("started");
    }
}