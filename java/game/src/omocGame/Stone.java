package omocGame;

public class Stone {
	private int x, y;
	private String dol;
	
	public Stone(int x, int y, String dol) {
		this.x = x;
		this.y = y;
		this.dol = dol;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getDol() {
		return dol;
	}
	public void setDol(String dol) {
		this.dol = dol;
	}
	
	
}
