import java.awt.*;
import java.util.Base64.Decoder;

import javax.swing.*;

public class GraphPanel extends JPanel {

    private int x1 = 30, x2 = 1200, y1 = 20, y2 = 600;

    private static int acceleration, velocity;
    private int yLine = 600;
    private int distance;
    private static final int BAR_THICKNESS = 25;
    private int width, height;

    public GraphPanel(int w, int h, int acceleration, int velocity) {

        width = w;
        height = h;
//         System.out.printf("%d  %d ", width, height);
        setSize(w, h);

        this.velocity = velocity;
        this.acceleration = acceleration;

        JFrame frame = new JFrame("Distanca");
        frame.setTitle("Distance");
        frame.setSize(w,h);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.getContentPane().add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0,0,width,height);
        g.setColor(Color.BLACK);
        CalcDistance cal = new CalcDistance();
        g.drawLine(x1, y2, x2, y2);
        g.drawLine(x1, y1, x1, y2);


        // for t= 0
        yLine -= 50;
        g.drawString((cal.getTimeVariable()) + "", x1 - 15, yLine + 10);
        distance = cal.getsX(velocity, acceleration);
        g.fillRect(x1, yLine, distance, BAR_THICKNESS);
        g.drawString("d = " + distance, distance + 50, yLine + 10);


        // for t =1
        g.setColor(Color.red);


        yLine -= 50;
        g.drawString((cal.getTimeVariable()) + "", x1 - 15, yLine + 10);
        distance = cal.getsX(velocity, acceleration);
        //getLastVariable(int velocity,int acceleration)
       g.fillRect(x1, yLine, distance* x2 / (cal.difference(x2, velocity, acceleration)), BAR_THICKNESS);
        g.drawString("d = " + distance, distance * x2 / (cal.difference(x2, velocity, acceleration)) + 50, yLine + 10);


        // for t=2
        g.setColor(Color.blue);
        yLine -= 50;
        g.drawString((cal.getTimeVariable()) + "", x1 - 15, yLine + 10);
        distance = cal.getsX(velocity, acceleration);
        g.fillRect(x1, yLine, distance* x2 / (cal.difference(x2, velocity, acceleration)), BAR_THICKNESS);
        g.drawString("d = " + distance, distance * x2 / (cal.difference(x2, velocity, acceleration)) + 50, yLine + 10);

        // for t=3
        yLine -= 50;
        g.setColor(Color.yellow);
        g.drawString((cal.getTimeVariable()) + "", x1 - 15, yLine + 10);

        distance = cal.getsX(velocity, acceleration);
        g.fillRect(x1, yLine, distance* x2 / (cal.difference(x2, velocity, acceleration)), BAR_THICKNESS);
        g.drawString("d = " + distance, distance * x2 / (cal.difference(x2, velocity, acceleration)) + 50, yLine + 10);

        // for t =4
        yLine -= 50;
        g.setColor(Color.CYAN);
        g.drawString((cal.getTimeVariable()) + "", x1 - 15, yLine + 10);

        distance = cal.getsX(velocity, acceleration);
        g.fillRect(x1, yLine, distance* x2 / (cal.difference(x2, velocity, acceleration)), BAR_THICKNESS);
        g.drawString("d = " + distance, distance * x2 / (cal.difference(x2, velocity, acceleration)) + 50, yLine + 10);

        // for t=5
        yLine -= 50;
        g.setColor(Color.GREEN);
        g.drawString((cal.getTimeVariable()) + "", x1 - 15, yLine + 10);

        distance = cal.getsX(velocity, acceleration);
        g.fillRect(x1, yLine, distance* x2 / (cal.difference(x2, velocity, acceleration)), BAR_THICKNESS);
        g.drawString("d = " + distance, distance * x2 / (cal.difference(x2, velocity, acceleration)) + 50, yLine + 10);

        // for t=6
        yLine -= 50;
        g.setColor(Color.orange);
        g.drawString((cal.getTimeVariable()) + "", x1 - 15, yLine + 10);
        distance = cal.getsX(velocity, acceleration);
        g.fillRect(x1, yLine, distance* x2 / (cal.difference(x2, velocity, acceleration)), BAR_THICKNESS);
        g.drawString("d = " + distance, distance * x2 / (cal.difference(x2, velocity, acceleration)) + 50, yLine + 10);

        // for t=7
        yLine -= 50;
        g.setColor(Color.magenta);
        g.drawString((cal.getTimeVariable()) + "", x1 - 15, yLine + 10);
        distance = cal.getsX(velocity, acceleration);
        g.fillRect(x1, yLine, distance* x2 / (cal.difference(x2, velocity, acceleration)), BAR_THICKNESS);
        g.drawString("d = " + distance, distance * x2 / (cal.difference(x2, velocity, acceleration)) + 50, yLine + 10);

        // for t=8
        yLine -= 50;
        g.setColor(Color.pink);
        g.drawString((cal.getTimeVariable()) + "", x1 - 15, yLine + 10);
        distance = cal.getsX(velocity, acceleration);
        g.fillRect(x1, yLine, distance* x2 / (cal.difference(x2, velocity, acceleration)), BAR_THICKNESS);
        g.drawString("d = " + distance, distance * x2 / (cal.difference(x2, velocity, acceleration)) + 50, yLine + 10);

        // for t=9
        yLine -= 50;
        g.setColor(Color.LIGHT_GRAY);
        g.drawString((cal.getTimeVariable()) + "", x1 - 15, yLine + 10);
        distance = cal.getsX(velocity, acceleration);
        g.fillRect(x1, yLine, distance* x2 / (cal.difference(x2, velocity, acceleration)), BAR_THICKNESS);
        g.drawString("d = " + distance, distance * x2 / (cal.difference(x2, velocity, acceleration)) + 50, yLine + 10);

        // for t=10
        yLine -= 50;
        g.setColor(Color.magenta);
        g.drawString((cal.getTimeVariable()) + "", x1 - 15, yLine + 10);
        distance = cal.getsX(velocity, acceleration);
        g.fillRect(x1, yLine, distance* x2 / (cal.difference(x2, velocity, acceleration)), BAR_THICKNESS);
        g.drawString("d = " + distance, distance * x2 / (cal.difference(x2, velocity, acceleration)) + 50, yLine + 10);

        g.setColor(Color.BLACK);
        g.drawLine(x1, y1, x1 - 5, y1 + 5);
        g.drawLine(x1, y1, x1 + 5, y1 + 5);
        g.drawString("t", x1 + 20, y1);
        yLine  = -10;

        //arrows  of the  axis
        g.drawLine(x2, y2, x2 - 10, y2 - 4);
        g.drawLine(x2, y2, x2 - 10, y2 + 4);
        g.drawString("d", x2 + 15, y2);
    }

}
