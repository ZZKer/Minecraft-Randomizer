package rando;

public class Input{
	public static boolean CRAFT = false;
	public static boolean SMELT = true;
	
	private boolean type;
	private String filename;
	private String itemExpression;
	
	public Input() {
		type = this.CRAFT;
		filename = "null";
		itemExpression = "";
	}
	
	public Input(boolean intype) {
		type = intype;
		filename = "null";
		itemExpression = "";
	}
	
	public Input(boolean intype, String file) {
		type = intype;
		filename = ""+file;
		itemExpression = "";
	}
	
	public Input(boolean intype, String file, String item) {
		type = intype;
		filename = ""+file;
		itemExpression = ""+item;
	}
	
	public String getName() {
		return filename+"";
	}
	
	public String getFilename() {
		return filename+".json";
	}
	
	public boolean isSmelt() {
		return type;
	}
	
	public String getExpression() {
		return itemExpression;
	}
}