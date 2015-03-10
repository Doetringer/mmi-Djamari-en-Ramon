import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {
	public ButtonPanel(ToolHandler th) {
		super();
		// Add a button to the panel . The argument to the JButton
		// constructor
		// will become the text on the button .

		ButtonHandler bh = new ButtonHandler(th);

		JButton b = new JButton("Ellipse");
		this.add(b);
		b.addActionListener(new ButtonHandler(th));
		JButton c = new JButton("Line");
		this.add(c);
		c.addActionListener(new ButtonHandler(th));
		JButton d = new JButton("Rectangle");
		this.add(d);
		d.addActionListener(new ButtonHandler(th));
		JButton e = new JButton("Delete");
		this.add(e);
		e.addActionListener(new ButtonHandler(th));
	}
}
