import java.awt.*;

/**
 * This program creates picture
 *
 * @author Alex Jihong Kim
 *
 */
public class Picture {
    /**
     * Starts the program
     * @param args command line arguments
     */
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(500, 500);
        panel.setBackground(Color.LIGHT_GRAY);   
        
        Graphics g = panel.getGraphics();
        
        g.drawString("Smiling Face", 200, 50);
        g.drawString("Author: Alex Jihong Kim", 200, 80);
        
        // Draws face
        g.setColor(Color.YELLOW);
        
        g.fillOval(150, 150, 200, 200);
        
        // Draws outer eye
        g.setColor(Color.BLACK);
        g.drawOval(150, 150, 200, 200);
        
        g.setColor(Color.WHITE);
        g.fillOval(190, 200, 30, 30);
        g.fillOval(280, 200, 30, 30);
        g.setColor(Color.BLACK);
        g.drawOval(190, 200, 30, 30);
        g.drawOval(280, 200, 30, 30);        
        
        // Draws inner eye
        g.setColor(Color.BLUE);
        g.fillOval(198, 206, 14, 18);
        g.fillOval(288, 206, 14, 18);
        
        // Draws mouse
        g.setColor(Color.MAGENTA);
        Polygon poly = new Polygon();
        poly.addPoint(230, 290);
        poly.addPoint(250, 330);
        poly.addPoint(270, 290);
        g.fillPolygon(poly);
    }
    
}
