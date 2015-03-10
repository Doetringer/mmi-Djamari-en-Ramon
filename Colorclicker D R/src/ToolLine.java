public class ToolLine implements ToolInterface {
	private DrawSurface ds;

	public ToolLine(DrawSurface ds) {
		this.ds = ds;
	}

	@Override
	public void handleClick(int x, int y) {
		MyShape m = new MyLine();
		m.setCoords(x - 50, y, x + 50, y);
		ds.addShape(m);
	}

	@Override
	public void handleClick(MyShape m, int x, int y) {
		// TODO Auto-generated method stub

	}
}
