public class ToolHandler {
	public static enum currentmode {
		delete, line, rectangle, ellipse, none
	};

	private ToolLine l;
	private ToolRectangle r;
	private ToolEllipse e;
	private ToolDelete d;
	private DrawSurface ds;

	public ToolHandler(DrawSurface ds) {
		l = new ToolLine(ds);
		r = new ToolRectangle(ds);
		e = new ToolEllipse(ds);
		d = new ToolDelete(ds);
		this.ds = ds;
	}

	private currentmode mode = currentmode.none;

	public void handleClick(int x, int y) {
		MyShape s = ds.getShape(x, y);
		switch (mode) {
		case line:
			l.handleClick(x, y);
			break;
		case rectangle:
			r.handleClick(x, y);
			break;
		case ellipse:
			e.handleClick(x, y);
			break;
		case delete:
			d.handleClick(s, x, y);
			break;
		}
	}

	public currentmode getMode() {
		return mode;
	}

	public void setMode(currentmode mode) {
		this.mode = mode;
	}
}
