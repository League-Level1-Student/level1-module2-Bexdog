package _99_extra;

import java.awt.Color;

public class PixelRunner {
public static void main(String[] args) {
	PixelParty pixel = new PixelParty();
	pixel.setColor(255,0,255);
	pixel.drawRectangle(25, 10, 20, 20);
	pixel.drawCircle(12, 5, 3);
	pixel.drawTriangle(80, 80, 100, 80, 90, 110);
	pixel.saveImage();
	pixel.displayImage();
	

	
	
}
}
