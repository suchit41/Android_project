import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Application_window extends JDialog
{
    private static final long serialVersionUID = 1L;
    public Application_window()
    {
        //Create a frame
        Frame f = new Frame();
        f.setSize(500, 300);

        //Prepare font
        Font font = new Font( "SansSerif", Font.PLAIN, 22 );

        //Write something
        Label label = new Label("welcome to payment system");
        label.setFont(Font.getFont("Times New Roman"));

        label.setForeground(Color.RED);
        label.setFont(font);
        f.add(label);

        //Make visible
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(final String[] args)
    {
        new Application_window();
    }
}