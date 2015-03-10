public class ToolDelete implements ToolInterface {

	private DrawSurface ds;

	public ToolDelete(DrawSurface ds) {
		this.ds = ds;
	}

	@Override
	public void handleClick(MyShape m, int x, int y) {
		if (m != null) {
			ds.deleteShape(m);
		}
	}

	@Override
	public void handleClick(int x, int y) {
		// TODO Auto-generated method stub

	}

}
