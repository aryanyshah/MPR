package Animation.src;
import java.awt.*;

import javax.swing.*;

public class HashAnimation extends JFrame
{
    HashAnimation()
    {
        setSize(800,600);
        setTitle("Hashing Visualization - Group 21");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Panel p = new Panel();
        p.setBackground(Color.WHITE);
        add(p);
    }

    public static void main(String[] args)
    {
        new HashAnimation().setVisible(true);
    }
}
