package ca.demetry.mcsolaris.random;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class RandomTextureGenerator {
	public RandomTextureGenerator(int i){
		try{
			int width = 16, height = 16;
			
			Random rand = new Random();
			
			BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
			
			Graphics2D graphics = image.createGraphics();
			
			graphics.setPaint(new Color(
					rand.nextFloat(),
					rand.nextFloat(),
					rand.nextFloat()
			));
			
			graphics.drawRoundRect(0, 0, width, height, width, height);
			
			ImageIO.write(image, "PNG", new File("C:\\Users\\Demetry\\Dropbox\\bin\\assets\\zeor_solaris\\textures\\blocks\\"+i+".png"));
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
