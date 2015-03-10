import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener {
	private DrawSurface pn;
	private ToolHandler th;

	public ButtonHandler(ToolHandler th) {
		super();
		this.pn = pn;
		this.th = th;
	}

	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		switch (cmd) {
		case "Ellipse":
			th.setMode(ToolHandler.currentmode.ellipse);
			break;
		case "Line":
			th.setMode(ToolHandler.currentmode.line);
			break;
		case "Rectangle":
			th.setMode(ToolHandler.currentmode.rectangle);
			break;
		case "Delete":
			th.setMode(ToolHandler.currentmode.delete);
			break;
		}
		/*
		 * int rand1 = (int) (Math.random() * 255); int rand2 = (int)
		 * (Math.random() * 255); int rand3 = (int) (Math.random() * 255); Color
		 * randColor = new Color(rand1, rand2, rand3); pn.setColor(randColor);
		 * pn.repaint();
		 */
	}
}