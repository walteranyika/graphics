 */
package write.text;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author waltersanchez
 */
public class WriteText {
   static int width=200;
   static int height=200;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        
          String [] names={"Tom Juma","Alan Wanga","Dennis Oliech"};

            
         for(int i=0; i<3;i++)
            {
            BufferedImage bufferedImg=ImageIO.read(new File("/Users/waltersanchez/Desktop/picha/template.png"));
            int h=bufferedImg.getHeight()/2;
            int w =bufferedImg.getWidth()/2;

            Graphics gg=bufferedImg.getGraphics();
            Graphics2D graphics = (Graphics2D) gg;
            graphics.setColor(Color.BLACK);
            Font ff= Font.createFont(Font.TRUETYPE_FONT, new File("/Users/waltersanchez/Desktop/picha/CALIBRIZ.TTF"));
            ff=ff.deriveFont(Font.BOLD,55);
            
            
            GraphicsEnvironment ge =GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(ff);

            
            /*       
            
             g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                             RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
            g2d.drawString(text, 20, 70);

            g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                                 RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB);
            */
            graphics.setFont(ff);
            graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                                       RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            
            FontMetrics metrics = graphics.getFontMetrics(graphics.getFont());
           
            
            Rectangle rect=new Rectangle(h, 0, w*2, 60);
            int x = (rect.width - metrics.stringWidth(names[i])) / 2;
              // Determine the Y coordinate for the text (note we add the ascent, as in java 2d 0 is top of the screen)
            int y = ((rect.height - metrics.getHeight()) / 2) + metrics.getAscent();
            
            
            Graphics2D g1= graphics;
            Graphics2D g2= graphics;
            Graphics2D g3= graphics;
            Graphics2D data[]={g1,g2,g3};
            
           
            data[i].drawString(names[i].toUpperCase(), x, 520); 
            ImageIO.write(bufferedImg, "png", new File("test"+i+".png"));
               // graphics.drawString(names[0], x, 520);
            graphics.dispose();
            
            }
            System.err.println("Image Created");
        /*final BufferedImage bufferedImg=ImageIO.read(new File("/Users/waltersanchez/Desktop/picha/template.png"));
            int h=bufferedImg.getHeight()/2;
            int w =bufferedImg.getWidth()/2;
            Graphics graphics=bufferedImg.getGraphics();
           // Graphics2D g2d = (Graphics2D) graphics;
            graphics.setColor(Color.BLACK);
            Font ff= Font.createFont(Font.TRUETYPE_FONT, new File("/Users/waltersanchez/Desktop/picha/CALIBRIZ.TTF"));
            ff=ff.deriveFont(Font.BOLD,44);
            
            
            GraphicsEnvironment ge =
            GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(ff);

            graphics.setFont(ff);
            FontMetrics metrics = graphics.getFontMetrics(graphics.getFont());
            String s = "Thomas Ndungu Mwangi";
            s=s.toUpperCase();
            
            Rectangle rect=new Rectangle(h, 0, w*2, 60);
            int x = (rect.width - metrics.stringWidth(s)) / 2;
              // Determine the Y coordinate for the text (note we add the ascent, as in java 2d 0 is top of the screen)
            int y = ((rect.height - metrics.getHeight()) / 2) + metrics.getAscent();
            graphics.drawString(s, x, 520); 
            ImageIO.write(bufferedImg, "png", new File("test.png"));
            System.err.println("Image Created");
            /*final BufferedImage bufferedImg=ImageIO.read(new File("/Users/waltersanchez/Desktop/picha/pic.jpg"));
            int h=bufferedImg.getHeight()/2;
            int w =bufferedImg.getWidth()/2;
            Graphics graphics=bufferedImg.getGraphics();
            graphics.setColor(Color.WHITE);
            graphics.setFont(new Font("Monaco", Font.ITALIC, 20));
            FontMetrics metrics = graphics.getFontMetrics(graphics.getFont());
            String s = "Tom Okumu Omondi";
            
            Rectangle rect=new Rectangle(h, 0, w*2, 60);
            int x = (rect.width - metrics.stringWidth(s)) / 2;
              // Determine the Y coordinate for the text (note we add the ascent, as in java 2d 0 is top of the screen)
            int y = ((rect.height - metrics.getHeight()) / 2) + metrics.getAscent();
            graphics.drawString(s, x, 200); 
            ImageIO.write(bufferedImg, "png", new File("test.png"));
            System.err.println("Image Created");
        */
       /* String names= "John Mark";
        final BufferedImage bufferedImg=ImageIO.read(new File("/Users/waltersanchez/Desktop/picha/pic.jpg"));
        int h=bufferedImg.getHeight()/2;
        int w =bufferedImg.getWidth()/2;
        Graphics graphics=bufferedImg.getGraphics();
        graphics.setColor(Color.WHITE);
        //graphics.fillRect(0, 0, 100, 50);
        graphics.setFont(new Font("Monaco", Font.ITALIC, 20));
        graphics.drawString(names, w, h);       
        ImageIO.write(bufferedImg, "png", new File("test.png"));
        System.err.println("Image Created");
        */
//        
       /* final BufferedImage image = ImageIO.read(new File("/Users/waltersanchez/Desktop/picha/pic.jpg"));
        Graphics g = image.getGraphics();
        g.setFont(g.getFont().deriveFont(30f));
        g.drawString("Omo Tribe", 100, 100);
        g.dispose();

        ImageIO.write(image, "png", new File("test.png"));*/
    }
    
}
