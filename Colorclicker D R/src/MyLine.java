import java.awt.Graphics2D;
import java.awt.geom.Line2D;

public class MyLine extends MyShape {

	public MyLine() {
		super();
	}

	public MyLine(int x1, int y1, int x2, int y2) {
		super(x1, y1, x2, y2);
	}

	@Override
	public boolean isWithin(int x, int y) {
		double rc;
		double intersect;
		if (startx < width) {
			if (x < startx || x > startx + width)
				return false;
			rc = ((double) (height - starty)) / (width - startx);
			intersect = starty - rc * startx;
		} else {
			if (x < width || x > startx + width)
				return false;
			rc = ((double) (starty - height)) / (startx - width);
			intersect = height - rc * width;
		}
		double dif = Math.abs((rc * x + intersect) - y);
		return ((int) dif) < 20;
	}

	@Override
	public void draw(Graphics2D g) {
		super.draw(g);
		Line2D.Double line = new Line2D.Double(startx, starty, width, height);
		g.draw(line);
	}

}
