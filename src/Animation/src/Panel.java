package Animation.src;
import java.awt.*;
import javax.swing.*;
public class Panel extends JPanel
{
    int y=800;
    int steps=10;
    int y0=800, steps0=10;
    int y1=800, steps1=10;
    int y2=800, steps2=10;
    int y3=800, steps3=10;
    int y4=800, steps4=10;
    int y5=800, steps5=10;
    int y6=800, steps6=10;

    // Inserting 20,31,62,16,112,96,32

    @Override
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
        g.drawString("Seperate Chaining Technique (OPEN HASHING)", 10, 20);

        g.drawRect(20, y, 75, 30);
        g.drawString("0", 50, (y+22));
        g.drawRect(95, y, 75, 30);
        g.drawString("1", 125, (y+22));
        g.drawRect(170, y, 75, 30);
        g.drawString("2", 200, (y+22));
        g.drawRect(245, y, 75, 30);
        g.drawString("3", 275, (y+22));
        g.drawRect(320, y, 75, 30);
        g.drawString("4", 350, (y+22));
        g.drawRect(395, y, 75, 30);
        g.drawString("5", 425, (y+22));
        g.drawRect(470, y, 75, 30);
        g.drawString("6", 500, (y+22));
        g.drawRect(545, y, 75, 30);
        g.drawString("7", 575, (y+22));
        g.drawRect(620, y, 75, 30);
        g.drawString("8", 650, (y+22));
        g.drawRect(695, y, 75, 30);
        g.drawString("9", 725, (y+22));
        
        y=y-steps;

        if(y==50)
        {
            steps=0;
            g.drawRect(25, y0, 60, 30);     //Inserting 20 to the Hashtable
            g.drawString("20", 45, (y0+22));
            y0=y0-steps0;
            if(y0==150)
            {
                steps0=0;
                g.drawLine(55, 80, 55, 150);
                
                g.drawRect(100, y1, 60, 30);     //Inserting 31 to the Hashtable
                g.drawString("31", 120, (y1+22));
                y1=y1-steps1;
                if(y1==150)
                {
                    steps1=0;
                    g.drawLine(130, 80, 130, 150);

                    g.drawRect(175, y2, 60, 30);     //Inserting 62 to the Hashtable
                    g.drawString("62", 195, (y2+22));
                    y2=y2-steps2;
                    if(y2==150)
                    {
                        steps2=0;
                        g.drawLine(205,80,205,150);
                        
                        g.drawRect(475, y3, 60, 30);     //Inserting 16 to the Hashtable
                        g.drawString("16", 495, (y3+22));
                        y3=y3-steps3;
                        if(y3==150)
                        {
                            steps3=0;
                            g.drawLine(505,80,505,150);

                            g.drawRect(175, y4, 60, 30);     //Inserting 112 to the Hashtable
                            g.drawString("112", 190, (y4+22));
                            y4=y4-steps4;
                            if(y4==250)
                            {
                                steps4=0;
                                g.drawLine(205,180,205,250);

                                g.drawRect(475, y5, 60, 30);     //Inserting 96 to the Hashtable
                                g.drawString("96", 495, (y5+22));
                                y5=y5-steps5;
                                if(y5==250)
                                {
                                    steps5=0;
                                    g.drawLine(505,180,505,250);

                                    g.drawRect(175, y6, 60, 30);     //Inserting 32 to the Hashtable
                                    g.drawString("32", 195, (y6+22));
                                    y6=y6-steps6;
                                    if(y6==350)
                                    {
                                        steps6=0;
                                        g.drawLine(205,280,205,350);

                                        g.setFont(new Font(Font.SERIF, Font.ITALIC, 20));
                                        g.drawString("Thank You!", 320, 540);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
        }
        

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        repaint();
    }
}
