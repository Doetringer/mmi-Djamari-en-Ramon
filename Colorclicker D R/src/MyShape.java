import java.awt.BasicStroke;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public abstract class MyShape {

	protected int width, height, startx, starty;

	public MyShape() {
		this(0, 0, 0, 0);
	}

	public MyShape(int x1, int y1, int x2, int y2) {
		width = Math.abs(x1 - x2);
		height = Math.abs(y1 - y2);
		startx = Math.min(x1, x2);
		starty = Math.min(y1, y2);
	}

	public boolean isWithin(int x, int y) {
		return x >= startx && x <= (startx + width) && y >= starty
				&& y <= (starty + height);
	}

	public void draw(Graphics2D g) {

		g.setStroke(new BasicStroke(3));
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
	}

	public void setCoords(int x1, int y1, int x2, int y2) {
		startx = x1;
		starty = y1;
		width = x2;
		height = y2;
	}

	public MyShape getShape(String m) {
		switch (m) {
		case "line":
			return new MyLine(0, 0, 0, 0);
		}
		return null;

	}

}