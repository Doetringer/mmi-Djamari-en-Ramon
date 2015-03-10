import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

public class Window extends JFrame {

	public Window() {
		// ’super’ calls a function inherited from the parent class (JFrame)
		super();
		super.setTitle("Callbacks");
		super.setSize(new Dimension(420, 350));
		// Make sure the window appears in the middle of your screen
		super.setLocationRelativeTo(null);
		// Determines what should happen when the frame is closed
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// Chooses a certain layout type for the elements in this frame
		super.getContentPane().setLayout(new BorderLayout());

		DrawSurface ds = new DrawSurface();
		ToolHandler th = new ToolHandler(ds);
		InputHandler ih = new InputHandler(th, ds);
		ButtonPanel bp = new ButtonPanel(th);
		// Places the RectPanel in the center of the frame
		super.getContentPane().add(ds, BorderLayout.CENTER);
		// Places the ButtonPanel in the top of the frame
		super.getContentPane().add(bp, BorderLayout.NORTH);
		// Set the window to visible ! Yup ... This is necessary
		super.setVisible(true);
	}
}
