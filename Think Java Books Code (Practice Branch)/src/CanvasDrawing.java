import java.awt.*;

public class CanvasDrawing extends Canvas
{
    public static void main(String[] args)
    {
        Frame frame = new Frame("MyFrame");
    }

    public void paint(Graphics g)
    {
        g.setColor(Color.green);
        g.fillOval(100, 100, 200, 200);
    }
}
