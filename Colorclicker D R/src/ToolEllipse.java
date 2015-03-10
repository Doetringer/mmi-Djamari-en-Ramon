public class ToolEllipse implements ToolInterface {
	private DrawSurface ds;

	public ToolEllipse(DrawSurface ds) {
		this.ds = ds;
	}

	@Override
	public void handleClick(int x, int y) {
		MyShape m = new MyEllipse(x - 50, y - 50, x + 50, y + 50);
		ds.addShape(m);
	}

	@Override
	public void handleClick(MyShape m, int x, int y) {
		// TODO Auto-generated method stub

	}
}