package utils;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Wesley
 */
public class ResourceLoader {
    
    public static BufferedImage loadImage(String path) {
        try {
            return ImageIO.read(ResourceLoader.class.getClassLoader().getResource(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
