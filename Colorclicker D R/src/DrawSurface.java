import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

public class DrawSurface extends JPanel {

	private Color color;
	private ArrayList<MyShape> shapes = new ArrayList<MyShape>();

	Random r = new Random();
	private final int xsize = 420;
	private final int ysize = 250;

	public DrawSurface() {
		super();
		this.color = Color.WHITE;
	}

	public MyShape getShape(int x, int y) {
		for (int i = (shapes.size() - 1); i >= 0; i--) {
			MyShape s = shapes.get(i);
			if (s.isWithin(x, y)) {
				return s;
			}
		}
		return null;
	}

	/*
	 * private MyShape getRandomShape() {
	 * 
	 * int s = r.nextInt(3); switch (s) { case 0: return new
	 * MyRectangle(r.nextInt(xsize), r.nextInt(ysize), r.nextInt(xsize),
	 * r.nextInt(ysize)); case 1: return new MyLine(r.nextInt(xsize),
	 * r.nextInt(ysize), r.nextInt(xsize), r.nextInt(ysize)); default: return
	 * new MyEllipse(r.nextInt(xsize), r.nextInt(ysize), r.nextInt(xsize),
	 * r.nextInt(ysize)); }
	 * 
	 * }
	 */
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(this.color);
		g.fillRect(0, 0, 420, 250);
		g.setColor(Color.BLACK);
		for (MyShape s : shapes) {
			s.draw((Graphics2D) g);
		}

	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	/*
	 * public void addRandomShape() { shapes.add(getRandomShape());
	 * this.repaint(); }
	 * 
	 * public void alterNextShape() { for (int i = 0; i < shapes.size(); i++)
	 * shapes.set(i, getRandomShape()); this.repaint(); }
	 */
	public void deleteShape(MyShape m) {
		shapes.remove(m);
		this.repaint();

	}

	public void addShape(MyShape m) {
		shapes.add(m);
		this.repaint();
	}
}
